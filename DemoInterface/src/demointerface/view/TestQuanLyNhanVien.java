/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demointerface.view;

import demointerface.interfacecc.INhanVien;
import demointerface.interfacecc.IQuanLyNhanVien;

/**
 *
 * @author Admin
 */
public class TestQuanLyNhanVien implements IQuanLyNhanVien {

    @Override
    public INhanVien[] nhapDanhSach() {
        System.out.println("nhap danh sach tessttt");
        return null;
    }

    @Override
    public void hienDanhSach(INhanVien[] invs) {
        System.out.println("hien danh sach tessttt ");
    }

}
