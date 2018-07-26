/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demointerface.ctrl;

import demointerface.interfacecc.INhanVien;
import demointerface.interfacecc.IQuanLyNhanVien;

/**
 *
 * @author Admin
 */
public class QuanLyNhanVienImpl implements IQuanLyNhanVien {

    @Override
    public INhanVien[] nhapDanhSach() {

        System.out.println("nhap so luong");
        INhanVien[] invs = new INhanVien[10];
        for (int i = 0; i < invs.length; i++) {
            invs[i] = createObj();
            invs[i].nhap();
        }

        return invs;
    }

    @Override
    public void hienDanhSach(INhanVien[] invs) {
        System.out.println("hien nhan vien");
        for (INhanVien inv : invs) {
            inv.hien();
        }

    }

    private INhanVien createObj() {
        return new DemoNhanVien();
    }

}
