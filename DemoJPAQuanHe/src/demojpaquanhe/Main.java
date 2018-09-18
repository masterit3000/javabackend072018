/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojpaquanhe;

import demojpaquanhe.ctrl.LophocJpaController;
import demojpaquanhe.ctrl.SinhvienJpaController;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DemoJPAQuanHePU");
        SinhvienJpaController sjc = new SinhvienJpaController(emf);
        LophocJpaController ljc = new LophocJpaController(emf);
        List<Lophoc> findLophocEntities = ljc.findLophocEntities();
        for (Lophoc findLophocEntity : findLophocEntities) {
            System.out.println(findLophocEntity.getMa());
            System.out.println(findLophocEntity.getTen());
            List<Sinhvien> sinhvienList = findLophocEntity.getSinhvienList();
            System.out.println("list sinh vien");
            for (Sinhvien sinhvien : sinhvienList) {
                System.out.println(sinhvien.getMa());
                System.out.println(sinhvien.getTen());
                System.out.println(sinhvien.getLophoc());
                if (sinhvien.getMa() == 13) {

                    try {
                        sinhvien.setLophoc(ljc.findLophoc(1));
                        sjc.edit(sinhvien);
                        System.out.println("update ok");
                    } catch (Exception ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("update not ok");
                    }
                }
            }
        }
    }
}
