/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demointerface.view;

import demointerface.interfacecc.IQuanLyNhanVien;
import demointerface.ctrl.QuanLyNhanVienImpl;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menu {

    public static void main(String[] args) {
//        IQuanLyNhanVien iqlnv = new TestQuanLyNhanVien();
        IQuanLyNhanVien iqlnv = new QuanLyNhanVienImpl();
        System.out.println("1. Nhap");
        System.out.println("2. Hien");
        System.out.println("3. tim kiem");
        System.out.println("4. Thoat");
        int chon = new Scanner(System.in).nextInt();
        switch (chon) {
            case 1:
                iqlnv.nhapDanhSach();
                break;
            default:
        }
    }

}
