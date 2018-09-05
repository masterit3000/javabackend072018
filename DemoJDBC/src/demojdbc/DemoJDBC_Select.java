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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoJDBC_Select {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection cnn = null;
        PreparedStatement prepareStatement = null;
        ResultSet rs = null;
        try {
            // TODO code application logic here
            //cacsa buoc ket noi sql trong java
            //b1: dowwnload va add jdbc driver
            //b2: load driver va mo ket noi den db
//        com.mysql.jdbc.Driver
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost/javabackedn", "javabackend", "12345");
            prepareStatement = cnn.prepareStatement(
                    "Select * from`sinhvien` where ten like ?");
            prepareStatement.setString(1, "%van%");
            rs = prepareStatement.executeQuery();
            while (rs.next()) {
                int masv = rs.getInt("ma");
                String ten = rs.getString(2);
                Date d = rs.getDate("ngaysinh");
                
                System.out.println(masv);
                System.out.println(ten);
                System.out.println(d);
                System.out.println("************************************");
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DemoJDBC_Select.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DemoJDBC_Select.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(DemoJDBC_Select.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                prepareStatement.close();
            } catch (SQLException ex) {
                Logger.getLogger(DemoJDBC_Select.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                cnn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DemoJDBC_Select.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
