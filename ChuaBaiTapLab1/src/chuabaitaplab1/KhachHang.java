/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuabaitaplab1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class KhachHang {

    public int ma;
    public String ten;
    public ThoiGian ngaySinh;

    public void nhapDuLieu() {

        System.out.println("Moi nhap ma ten");
        this.ma = new Scanner(System.in).nextInt();
        this.ten = new Scanner(System.in).nextLine();
        System.out.println("moi nhap ngay sinh");
        if (this.ngaySinh == null) {
            this.ngaySinh = new ThoiGian();
        }
        this.ngaySinh.nhapDuLieu();

    }

    public void hienThongTin() {

        System.out.println("ma = " + this.ma + "| ten=" + this.ten);
        if (this.ngaySinh != null) {
            this.ngaySinh.hienThongTin();
        }
    }

    public int soSanhNgaySinh(KhachHang kh) {

        if (kh != null) {
            return this.ngaySinh.soSanh(kh.ngaySinh);
        }
        return 1;
    }

}
