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
public class QuanLy  extends NhanVien{

    private int soNhanVien;
   
    public int getSoNhanVien() {
        return soNhanVien;
    }

    public void setSoNhanVien(int soNhanVien) {
        this.soNhanVien = soNhanVien;
    }

    @Override
    public void nhapThongTin() {
        System.out.print("\tNhap ten: ");
        setTen(new Scanner(System.in).nextLine());
        System.out.print("\tChon gioi tinh 1=>Nam, 0=>Nu,-1=>KXD: ");
        int maGioiTinh = new Scanner(System.in).nextInt();
        setGioiTinh(GioiTinh.layMaGioiTinh(maGioiTinh));
        System.out.print("\tNhap luong: ");
        setLuong(new Scanner(System.in).nextFloat());
        System.out.print("\tNhap so nhan vien: ");
        setSoNhanVien(new Scanner(System.in).nextInt());
    }

    @Override
    public float tinhThuNhap() {
        int phuCap = 0;
        if (this.soNhanVien < 10) {
            phuCap = 500;
        } else {
            if (this.soNhanVien <= 20) {
                phuCap = 1000;
            } else {
                phuCap = 2000;
            }
            
        }
        return this.getLuong() + phuCap;
    }

    @Override
    public void hienThongTin() {
        super.hienThongTin();
        System.out.println("\tSoNhanVien: " + this.soNhanVien);
        System.out.println("\tThu nhap: " + this.tinhThuNhap());
    }

}
