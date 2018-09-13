/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojdbc_mvc.controller;

import demojdbc_mvc.dao.model.SinhVien;

/**
 *
 * @author Admin
 */
public class SinhVienMapping implements IMapping<SinhVienDTO, SinhVien> {

    public SinhVienDTO modelToDTO(SinhVien sv) {

        SinhVienDTO dTO = new SinhVienDTO(sv.getMa(), sv.getTen(), sv.getNgaySinh().toString());//dung rangay sinh phai format lai

        return dTO;
    }

    public SinhVien dTOTomodel(SinhVienDTO sv) {

        SinhVien dTO = new SinhVien(sv.getMa(), sv.getTen(), null);//dung rangay sinh phai chyen tu string sang date

        return dTO;
    }
}
