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
public class CongNhan extends NhanVien {

    private int ngayCong;

    public int getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(int ngayCong) {
        this.ngayCong = ngayCong;
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
        System.out.print("\tNhap ngay cong: ");
        setNgayCong(new Scanner(System.in).nextInt());
    }

    @Override
    public float tinhThuNhap() {
        return this.getLuong() + this.getLuong() * (this.ngayCong / 26);
    }

    @Override
    public void hienThongTin() {
        super.hienThongTin();
        System.out.println("\tNgay cong: " + this.ngayCong);
        System.out.println("\tThu nhap: " + this.tinhThuNhap());
    }
}
