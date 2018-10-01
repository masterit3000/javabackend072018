/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democtrl;

import java.text.SimpleDateFormat;
import modeljpa.Sinhvien;

/**
 *
 * @author Admin
 */
public class SinhVienMapper {

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public SinhVienDTO toDTO(Sinhvien sv) {

        if (sv != null) {

            SinhVienDTO svdto = new SinhVienDTO();
            svdto.setMa(sv.getMa());
            svdto.setTen(sv.getTen());
            String format = dateFormat.format(sv.getNgaysinh());
            svdto.setNgaysinh(format);
            return svdto;
        }
        return null;
    }
}
