/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojpaquanhe.ctrl;

import demojpaquanhe.Lophoc;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import demojpaquanhe.Sinhvien;
import demojpaquanhe.ctrl.exceptions.IllegalOrphanException;
import demojpaquanhe.ctrl.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Admin
 */
public class LophocJpaController implements Serializable {

    public LophocJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Lophoc lophoc) {
        if (lophoc.getSinhvienList() == null) {
            lophoc.setSinhvienList(new ArrayList<Sinhvien>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Sinhvien> attachedSinhvienList = new ArrayList<Sinhvien>();
            for (Sinhvien sinhvienListSinhvienToAttach : lophoc.getSinhvienList()) {
                sinhvienListSinhvienToAttach = em.getReference(sinhvienListSinhvienToAttach.getClass(), sinhvienListSinhvienToAttach.getMa());
                attachedSinhvienList.add(sinhvienListSinhvienToAttach);
            }
            lophoc.setSinhvienList(attachedSinhvienList);
            em.persist(lophoc);
            
            for (Sinhvien sinhvienListSinhvien : lophoc.getSinhvienList()) {
                Lophoc oldLophocOfSinhvienListSinhvien = sinhvienListSinhvien.getLophoc();
                sinhvienListSinhvien.setLophoc(lophoc);
                sinhvienListSinhvien = em.merge(sinhvienListSinhvien);
                if (oldLophocOfSinhvienListSinhvien != null) {//sv da thuoc lop hoc nao do rôi, thì sưa lai list sv của obj lớp đó, bỏ sv này đi
                    oldLophocOfSinhvienListSinhvien.getSinhvienList().remove(sinhvienListSinhvien);//bỏ đi
                    oldLophocOfSinhvienListSinhvien = em.merge(oldLophocOfSinhvienListSinhvien);//cap nhat lai lop cu
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Lophoc lophoc) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Lophoc persistentLophoc = em.find(Lophoc.class, lophoc.getMa());
            List<Sinhvien> sinhvienListOld = persistentLophoc.getSinhvienList();
            List<Sinhvien> sinhvienListNew = lophoc.getSinhvienList();
            List<String> illegalOrphanMessages = null;
            for (Sinhvien sinhvienListOldSinhvien : sinhvienListOld) {
                if (!sinhvienListNew.contains(sinhvienListOldSinhvien)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Sinhvien " + sinhvienListOldSinhvien + " since its lophoc field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            List<Sinhvien> attachedSinhvienListNew = new ArrayList<Sinhvien>();
            for (Sinhvien sinhvienListNewSinhvienToAttach : sinhvienListNew) {
                sinhvienListNewSinhvienToAttach = em.getReference(sinhvienListNewSinhvienToAttach.getClass(), sinhvienListNewSinhvienToAttach.getMa());
                attachedSinhvienListNew.add(sinhvienListNewSinhvienToAttach);
            }
            sinhvienListNew = attachedSinhvienListNew;
            lophoc.setSinhvienList(sinhvienListNew);
            lophoc = em.merge(lophoc);
            for (Sinhvien sinhvienListNewSinhvien : sinhvienListNew) {
                if (!sinhvienListOld.contains(sinhvienListNewSinhvien)) {
                    Lophoc oldLophocOfSinhvienListNewSinhvien = sinhvienListNewSinhvien.getLophoc();
                    sinhvienListNewSinhvien.setLophoc(lophoc);
                    sinhvienListNewSinhvien = em.merge(sinhvienListNewSinhvien);
                    if (oldLophocOfSinhvienListNewSinhvien != null && !oldLophocOfSinhvienListNewSinhvien.equals(lophoc)) {
                        oldLophocOfSinhvienListNewSinhvien.getSinhvienList().remove(sinhvienListNewSinhvien);
                        oldLophocOfSinhvienListNewSinhvien = em.merge(oldLophocOfSinhvienListNewSinhvien);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = lophoc.getMa();
                if (findLophoc(id) == null) {
                    throw new NonexistentEntityException("The lophoc with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Lophoc lophoc;
            try {
                lophoc = em.getReference(Lophoc.class, id);
                lophoc.getMa();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The lophoc with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Sinhvien> sinhvienListOrphanCheck = lophoc.getSinhvienList();
            for (Sinhvien sinhvienListOrphanCheckSinhvien : sinhvienListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Lophoc (" + lophoc + ") cannot be destroyed since the Sinhvien " + sinhvienListOrphanCheckSinhvien + " in its sinhvienList field has a non-nullable lophoc field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(lophoc);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Lophoc> findLophocEntities() {
        return findLophocEntities(true, -1, -1);
    }

    public List<Lophoc> findLophocEntities(int maxResults, int firstResult) {
        return findLophocEntities(false, maxResults, firstResult);
    }

    private List<Lophoc> findLophocEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Lophoc.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Lophoc findLophoc(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Lophoc.class, id);
        } finally {
            em.close();
        }
    }

    public int getLophocCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Lophoc> rt = cq.from(Lophoc.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
