/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demointerface.ctrl;

import demointerface.interfacecc.INhanVien;

/**
 *
 * @author Admin
 */
public class DemoNhanVien implements INhanVien {

    @Override
    public void nhap() {
        System.out.println("nhan dât snhan vien");
    }

}
