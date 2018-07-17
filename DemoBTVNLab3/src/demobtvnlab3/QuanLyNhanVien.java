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
public class QuanLyNhanVien {

    public NhanVien[] nhapDanhSachNhanVien() {

        System.out.println("nhap so luong nhan vien:");
        int soLuong = new Scanner(System.in).nextInt();//cho nay can xu ly nguoi dung nhap soLuong <0
        NhanVien[] ds = new NhanVien[soLuong];
        for (int i = 0; i < ds.length; i++) {
            ds[i] = new NhanVien();
            ds[i].nhap();

        }
        return ds;
    }

    public void hienDanhSach(NhanVien[] ds) {

        if (ds != null) {

            for (int i = 0; i < ds.length; i++) {
                NhanVien nv = ds[i];
                System.out.println("nhan vien thu: " + i);
                if (nv != null) {
                    nv.hienThongTin();
                } else {
                    System.out.println("null");
                }
            }
        }
    }

    public NhanVien[] timTheoGioiTinh(NhanVien[] ds, GioiTinh gt) {
        if (ds != null && gt != null) {
            int count = 0;
            for (int i = 0; i < ds.length; i++) {
                NhanVien nv = ds[i];
                if (nv.getGioiTinh() == gt) {
                    count++;
                }
            }
            NhanVien[] kq = new NhanVien[count];
            count = 0;
            for (int i = 0; i < ds.length; i++) {
                NhanVien nv = ds[i];
                if (nv.getGioiTinh() == gt) {
                    kq[count] = ds[i];
                    count++;
                }
            }
            sapXepTheoTen(kq);
            return kq;

        }
        return null;

    }

    private void sapXepTheoTen(NhanVien[] ds) {

        if (ds != null) {

            for (int i = 0; i < ds.length; i++) {
                for (int j = i; j < ds.length; j++) {
                    if (ds[i].getTen().compareTo(ds[j].getTen()) < 0) {

                        NhanVien tg = ds[i];
                        ds[i] = ds[j];
                        ds[j] = tg;
                    }
                }
            }
        }
    }

}
