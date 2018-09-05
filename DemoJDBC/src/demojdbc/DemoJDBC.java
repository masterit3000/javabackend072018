/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection cnn = null;
        PreparedStatement prepareStatement = null;
        try {
            // TODO code application logic here
            //cacsa buoc ket noi sql trong java
            //b1: dowwnload va add jdbc driver
            //b2: load driver va mo ket noi den db
//        com.mysql.jdbc.Driver
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost/javabackedn", "javabackend", "12345");
            prepareStatement = cnn.prepareStatement(
                    "INSERT INTO `sinhvien` ( `ten`, `ngaysinh`) VALUES (?, ?)");
            prepareStatement.setString(1, "Nguyen Thi DDD");
//            prepareStatement.setDate(2, new Date(1536157095));
            System.out.println(new java.util.Date().getTime());
            prepareStatement.setDate(2, new Date(new java.util.Date().getTime()));
            int soDongBiTuongTac = prepareStatement.executeUpdate();
            if (soDongBiTuongTac > 0) {
                System.out.println("insert thanh cong");
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DemoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DemoJDBC.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                prepareStatement.close();
            } catch (SQLException ex) {
                Logger.getLogger(DemoJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                cnn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DemoJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
