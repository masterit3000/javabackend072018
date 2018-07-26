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
public class Menu {

    private QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
    private NhanVien[] dsNhanvien = null;

    public void hienMenuChinh() {

        while (true) {
            System.out.println("1. Nhap");
            System.out.println("2. Hien thi");
            System.out.println("3. Tim nhan vien co thu nhap cao");
            System.out.println("4. Thoat");
            System.out.print("Chon chuc nang: ");
            int luaChon = new Scanner(System.in).nextInt();

            switch (luaChon) {
                case 1:
                    dsNhanvien = quanLyNhanVien.nhapDanhSach();

                    break;
                case 2:
                    if (dsNhanvien == null) {
                        System.out.println("chua chon 1");
                        break;
                    }
                    System.out.println("Danh sach nhan vien");
                    quanLyNhanVien.hienThongTinNhanVien(dsNhanvien);
                    System.out.println("==================================");
                    break;
                case 3:
                    if (dsNhanvien == null) {
                        System.out.println("chua chon 1");
                        break;
                    }
                    System.out.println("\tLua chon tim kiem 1=>Gioi tinh, 2=>Vi tri");
                    int timKiem = new Scanner(System.in).nextInt();
                    NhanVien[] dsTimKiem = loaiTimKiem(timKiem);
                    quanLyNhanVien.hienThongTinNhanVien(dsTimKiem);
                    System.out.println("==================================");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Nhap sai, nhap lai: ");
            }
        }
    }

    public NhanVien[] loaiTimKiem(int luaChon) {

        switch (luaChon) {
            case 1:
                System.out.print("\tChon gioi tinh 1=>Nam, 0=>Nu,-1=>KXD: ");
                int maGioiTinh = new Scanner(System.in).nextInt();
                return quanLyNhanVien.timThuNhapTheoGioiTinh(dsNhanvien, GioiTinh.layMaGioiTinh(maGioiTinh));
            case 2:
                System.out.print("\tChon vi tri 1=>Quan ly, 2=>Nhan vien,3=>Cong nhan: ");
                int viTri = new Scanner(System.in).nextInt();
                return quanLyNhanVien.timThuNhapTheoViTri(dsNhanvien, viTri);
            default:
                return null;
        }
    }

}
