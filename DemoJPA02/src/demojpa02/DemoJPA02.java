/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojpa02;

import demojpa02.ctrl.SinhVienJpaController;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Admin
 */
public class DemoJPA02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DemoJPA02PU");
        SinhVienJpaController svjc = new SinhVienJpaController(emf);
        SinhVien sv = new SinhVien();
        sv.setTen("Sinh vien jpa2222");
        sv.setNgaysinh(new Date());
        svjc.create(sv);
    }

    public static void main4(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DemoJPA02PU");
        EntityManager em = emf.createEntityManager();
        TypedQuery<SinhVien> createQuery = em.createQuery("Select s from SinhVien s where s.ma >:ma", SinhVien.class);
        createQuery.setParameter("ma", 6);
//        TypedQuery<SinhVien> createQuery = em.createNamedQuery("SinhVien.findAll", SinhVien.class);
        List<SinhVien> resultList = createQuery.getResultList();
        for (SinhVien sinhVien : resultList) {
            System.out.println(sinhVien);
        }

    }

    public static void main3(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DemoJPA02PU");
        EntityManager em = emf.createEntityManager();
        SinhVien sv2 = em.find(SinhVien.class, 2);
        System.out.println(sv2.getMa());
        System.out.println(sv2.getTen());
        System.out.println(sv2.getNgaysinh());
        sv2.setTen("sinh vien 01 jpa");
        em.getTransaction().begin();
        em.merge(sv2);
        em.getTransaction().commit();
        em.close();

    }

    public static void main2(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DemoJPA02PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        SinhVien sv = new SinhVien();
        sv.setTen("Sinh vien jpa");
        sv.setNgaysinh(new Date());
        try {
            em.persist(sv);//tao sinh vien moi
            em.persist(sv);//tao sinh vien moi
            em.persist(sv);//tao sinh vien moi

            em.getTransaction().commit();
            System.out.println("ok ok");
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        }
        em.close();

    }

    public void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DemoJPA02PU");
        EntityManager em = emf.createEntityManager();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

}
