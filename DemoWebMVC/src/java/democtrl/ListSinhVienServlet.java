/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democtrl;

import com.sun.corba.se.spi.presentation.rmi.PresentationManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.UserTransaction;
import model.jpactrl.SinhvienJpaController;
import modeljpa.Sinhvien;
import org.osgi.service.jpa.EntityManagerFactoryBuilder;

/**
 *
 * @author Admin
 */
@WebServlet(name = "ListSinhVienServlet", urlPatterns = {"/ListSinhVienServlet"})
public class ListSinhVienServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Resource
    private UserTransaction utx = null;

    @PersistenceUnit(unitName = "DemoWebMVCPU")
    private EntityManagerFactory emf = null;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) {
        try {
            //        emf = Persistence.createEntityManagerFactory("")
            SinhvienJpaController svsctrl = new SinhvienJpaController(utx, emf);
            List<Sinhvien> list = svsctrl.findSinhvienEntities();
            System.out.println(list.size());
            List<SinhVienDTO> listDTO = list.stream().map(new SinhVienMapper()::toDTO).collect(Collectors.toList());
            request.setAttribute("list", listDTO);
            request.getRequestDispatcher("/listSinhVien.jsp").forward(request, response);
            
        } catch (Exception ex) {
            Logger.getLogger(ListSinhVienServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
