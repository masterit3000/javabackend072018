/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demobtvnlab3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVien {

    private int ma;
    private String ten;
    private GioiTinh gioiTinh;
    private static int maHienTai = 0;

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public GioiTinh getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(GioiTinh gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public NhanVien() {
        this.ma = maHienTai;
        maHienTai++;
    }

    public NhanVien(String ten, GioiTinh gioiTinh) {
        this.ma = maHienTai;
        maHienTai++;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
    }

    public void nhap() {

        System.out.println("nhap ten");
        this.ten = new Scanner(System.in).nextLine();
        System.out.println("nhap gioi tinh 1-> Nam, 0-> Nu, Khong xac dinh");
        int gt = new Scanner(System.in).nextInt();
        this.gioiTinh = GioiTinh.getbyCode(gt);

    }

    public void hienThongTin() {

        System.out.println("ma = " + this.ma + "|ten=" + this.ten + "|GioiTinh: " + this.gioiTinh.getTen());
    }
}
