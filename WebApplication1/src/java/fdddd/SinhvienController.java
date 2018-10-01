/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fdddd;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.faces.FacesException;
import javax.annotation.Resource;
import javax.transaction.UserTransaction;
import fdddd.util.JsfUtil;
import fdddd.util.PagingInfo;
import java.util.List;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.model.SelectItem;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author Admin
 */
public class SinhvienController {

    public SinhvienController() {
        pagingInfo = new PagingInfo();
        converter = new SinhvienConverter();
    }
    private Sinhvien sinhvien = null;
    private List<Sinhvien> sinhvienItems = null;
    private SinhvienFacade jpaController = null;
    private SinhvienConverter converter = null;
    private PagingInfo pagingInfo = null;
    @Resource
    private UserTransaction utx = null;
    
    @PersistenceUnit(unitName = "WebApplication1PU")
    private EntityManagerFactory emf = null;

    public PagingInfo getPagingInfo() {
        if (pagingInfo.getItemCount() == -1) {
            pagingInfo.setItemCount(getJpaController().count());
        }
        return pagingInfo;
    }

    public SinhvienFacade getJpaController() {
        if (jpaController == null) {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            jpaController = (SinhvienFacade) facesContext.getApplication().getELResolver().getValue(facesContext.getELContext(), null, "sinhvienJpa");
        }
        return jpaController;
    }

    public SelectItem[] getSinhvienItemsAvailableSelectMany() {
        return JsfUtil.getSelectItems(getJpaController().findAll(), false);
    }

    public SelectItem[] getSinhvienItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(getJpaController().findAll(), true);
    }

    public Sinhvien getSinhvien() {
        if (sinhvien == null) {
            sinhvien = (Sinhvien) JsfUtil.getObjectFromRequestParameter("jsfcrud.currentSinhvien", converter, null);
        }
        if (sinhvien == null) {
            sinhvien = new Sinhvien();
        }
        return sinhvien;
    }

    public String listSetup() {
        reset(true);
        return "sinhvien_list";
    }

    public String createSetup() {
        reset(false);
        sinhvien = new Sinhvien();
        return "sinhvien_create";
    }

    public String create() {
        try {
            utx.begin();
        } catch (Exception ex) {
        }
        try {
            Exception transactionException = null;
            getJpaController().create(sinhvien);
            try {
                utx.commit();
            } catch (javax.transaction.RollbackException ex) {
                transactionException = ex;
            } catch (Exception ex) {
            }
            if (transactionException == null) {
                JsfUtil.addSuccessMessage("Sinhvien was successfully created.");
            } else {
                JsfUtil.ensureAddErrorMessage(transactionException, "A persistence error occurred.");
            }
        } catch (Exception e) {
            try {
                utx.rollback();
            } catch (Exception ex) {
            }
            JsfUtil.ensureAddErrorMessage(e, "A persistence error occurred.");
            return null;
        }
        return listSetup();
    }

    public String detailSetup() {
        return scalarSetup("sinhvien_detail");
    }

    public String editSetup() {
        return scalarSetup("sinhvien_edit");
    }

    private String scalarSetup(String destination) {
        reset(false);
        sinhvien = (Sinhvien) JsfUtil.getObjectFromRequestParameter("jsfcrud.currentSinhvien", converter, null);
        if (sinhvien == null) {
            String requestSinhvienString = JsfUtil.getRequestParameter("jsfcrud.currentSinhvien");
            JsfUtil.addErrorMessage("The sinhvien with id " + requestSinhvienString + " no longer exists.");
            return relatedOrListOutcome();
        }
        return destination;
    }

    public String edit() {
        String sinhvienString = converter.getAsString(FacesContext.getCurrentInstance(), null, sinhvien);
        String currentSinhvienString = JsfUtil.getRequestParameter("jsfcrud.currentSinhvien");
        if (sinhvienString == null || sinhvienString.length() == 0 || !sinhvienString.equals(currentSinhvienString)) {
            String outcome = editSetup();
            if ("sinhvien_edit".equals(outcome)) {
                JsfUtil.addErrorMessage("Could not edit sinhvien. Try again.");
            }
            return outcome;
        }
        try {
            utx.begin();
        } catch (Exception ex) {
        }
        try {
            Exception transactionException = null;
            getJpaController().edit(sinhvien);
            try {
                utx.commit();
            } catch (javax.transaction.RollbackException ex) {
                transactionException = ex;
            } catch (Exception ex) {
            }
            if (transactionException == null) {
                JsfUtil.addSuccessMessage("Sinhvien was successfully updated.");
            } else {
                JsfUtil.ensureAddErrorMessage(transactionException, "A persistence error occurred.");
            }
        } catch (Exception e) {
            try {
                utx.rollback();
            } catch (Exception ex) {
            }
            JsfUtil.ensureAddErrorMessage(e, "A persistence error occurred.");
            return null;
        }
        return detailSetup();
    }

    public String remove() {
        String idAsString = JsfUtil.getRequestParameter("jsfcrud.currentSinhvien");
        Integer id = new Integer(idAsString);
        try {
            utx.begin();
        } catch (Exception ex) {
        }
        try {
            Exception transactionException = null;
            getJpaController().remove(getJpaController().find(id));
            try {
                utx.commit();
            } catch (javax.transaction.RollbackException ex) {
                transactionException = ex;
            } catch (Exception ex) {
            }
            if (transactionException == null) {
                JsfUtil.addSuccessMessage("Sinhvien was successfully deleted.");
            } else {
                JsfUtil.ensureAddErrorMessage(transactionException, "A persistence error occurred.");
            }
        } catch (Exception e) {
            try {
                utx.rollback();
            } catch (Exception ex) {
            }
            JsfUtil.ensureAddErrorMessage(e, "A persistence error occurred.");
            return null;
        }
        return relatedOrListOutcome();
    }

    private String relatedOrListOutcome() {
        String relatedControllerOutcome = relatedControllerOutcome();
        if ((ERROR)) {
            return relatedControllerOutcome;
        }
        return listSetup();
    }

    public List<Sinhvien> getSinhvienItems() {
        if (sinhvienItems == null) {
            getPagingInfo();
            sinhvienItems = getJpaController().findRange(new int[]{pagingInfo.getFirstItem(), pagingInfo.getFirstItem() + pagingInfo.getBatchSize()});
        }
        return sinhvienItems;
    }

    public String next() {
        reset(false);
        getPagingInfo().nextPage();
        return "sinhvien_list";
    }

    public String prev() {
        reset(false);
        getPagingInfo().previousPage();
        return "sinhvien_list";
    }

    private String relatedControllerOutcome() {
        String relatedControllerString = JsfUtil.getRequestParameter("jsfcrud.relatedController");
        String relatedControllerTypeString = JsfUtil.getRequestParameter("jsfcrud.relatedControllerType");
        if (relatedControllerString != null && relatedControllerTypeString != null) {
            FacesContext context = FacesContext.getCurrentInstance();
            Object relatedController = context.getApplication().getELResolver().getValue(context.getELContext(), null, relatedControllerString);
            try {
                Class<?> relatedControllerType = Class.forName(relatedControllerTypeString);
                Method detailSetupMethod = relatedControllerType.getMethod("detailSetup");
                return (String) detailSetupMethod.invoke(relatedController);
            } catch (ClassNotFoundException e) {
                throw new FacesException(e);
            } catch (NoSuchMethodException e) {
                throw new FacesException(e);
            } catch (IllegalAccessException e) {
                throw new FacesException(e);
            } catch (InvocationTargetException e) {
                throw new FacesException(e);
            }
        }
        return null;
    }

    private void reset(boolean resetFirstItem) {
        sinhvien = null;
        sinhvienItems = null;
        pagingInfo.setItemCount(-1);
        if (resetFirstItem) {
            pagingInfo.setFirstItem(0);
        }
    }

    public void validateCreate(FacesContext facesContext, UIComponent component, Object value) {
        Sinhvien newSinhvien = new Sinhvien();
        String newSinhvienString = converter.getAsString(FacesContext.getCurrentInstance(), null, newSinhvien);
        String sinhvienString = converter.getAsString(FacesContext.getCurrentInstance(), null, sinhvien);
        if (!newSinhvienString.equals(sinhvienString)) {
            createSetup();
        }
    }

    public Converter getConverter() {
        return converter;
    }
    
}
