/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabackend_ex4;

import java.util.Scanner;

/**
 *
 * @author DatPT
 */
public abstract class NhanVien {

    private int ma;
    private String ten;
    private GioiTinh gioiTinh;
    private float luong;

    private static int maTrungGian = 0;

    public NhanVien() {
        this.ma = maTrungGian;
        maTrungGian++;
    }

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

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    
    public abstract void nhapThongTin();

    public abstract float tinhThuNhap();
        
    public void hienThongTin() {
        System.out.println("\tMa: " + this.ma);
        System.out.println("\tTen: " + this.ten);
        System.out.println("\tGioi tinh: " + this.gioiTinh.getChu());
        System.out.println("\tLuong: " + this.luong);            
    }
}
