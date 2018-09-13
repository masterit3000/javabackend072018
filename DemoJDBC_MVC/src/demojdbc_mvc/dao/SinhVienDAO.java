/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojdbc_mvc.dao;

import com.sun.org.apache.bcel.internal.generic.AASTORE;
import demojdbc_mvc.dao.model.SinhVien;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class SinhVienDAO implements ISinhVienDAO{

    public SinhVien addNew(SinhVien sv) {

        if (sv != null) {//option class Java 8
            Connection cnn = DBConection.open();
            PreparedStatement ps = null;
            if (cnn != null) {
                try {
                    ps = cnn.prepareStatement("insert into sinhvien(ten, ngaySinh) value (?,?");
                    ps.setInt(1, sv.getMa());
                    ps.setDate(2, new Date(sv.getNgaySinh().getTime()));
                    int executeUpdate = ps.executeUpdate();
                    if (executeUpdate > 0) {
                        //neu chuan lay ve ma sinh vien vua insert va gan nguoc lai sv 
                        return sv;
                    }
                    return null;
                } catch (SQLException ex) {
                    Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                } finally {

                    DBConection.close(null, ps, cnn);
                }
            }
        }

        return null;
    }

    public List<SinhVien> getAll() {
        List<SinhVien> list = null;
        Connection cnn = DBConection.open();
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (cnn != null) {
            try {
                ps = cnn.prepareStatement("select * from SinhVien");
                rs = ps.executeQuery();
                list = new ArrayList<>();
                while (rs.next()) {
                    int masv = rs.getInt("ma");
                    String ten = rs.getString(2);
                    Date d = rs.getDate("ngaysinh");
                    java.util.Date date = new java.util.Date(d.getTime());

                    SinhVien sinhVien = new SinhVien(masv, ten, date);
                    list.add(sinhVien);
                }

                return list;

            } catch (SQLException ex) {
                Logger.getLogger(SinhVienDAO.class
                        .getName()).log(Level.SEVERE, null, ex);
            } finally {

                DBConection.close(rs, ps, cnn);
            }
        }
        return null;
    }

    @Override
    public SinhVien updateByID(SinhVien T) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SinhVien findByID(SinhVien t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
