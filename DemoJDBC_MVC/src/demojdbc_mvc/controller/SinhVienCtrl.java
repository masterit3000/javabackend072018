/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojdbc_mvc.controller;

import demojdbc_mvc.dao.IDAO;
import demojdbc_mvc.dao.SinhVienDAO;
import demojdbc_mvc.dao.model.SinhVien;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SinhVienCtrl implements IController<SinhVienDTO> {

    IDAO<SinhVien> dao;
    IMapping<SinhVienDTO, SinhVien> map;

    @Override
    public SinhVienDTO addNew(SinhVienDTO T) {
        //chuyen sinhVienDTO thaanh sinh vien sau do goi DAo
        map = new SinhVienMapping();
        dao = new SinhVienDAO();
        SinhVien dTOTomodel = map.dTOTomodel(T);
        SinhVien addNew = dao.addNew(dTOTomodel);
        return map.modelToDTO(addNew);

    }

    @Override
    public SinhVienDTO updateByID(SinhVienDTO T) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SinhVienDTO> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SinhVienDTO findByID(SinhVienDTO t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
