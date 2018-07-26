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
public class QuanLyNhanVien {
    // xu ly tren danh sach nhan vien

    public static final int QUAN_LY = 1;
    public static final int NHAN_VIEN_VAN_PHONG = 2;
    public static final int CONG_NHAN = 3;

    private int loaiNhanVien() {
        System.out.println("1. Quan ly");
        System.out.println("2. Nhan vien van phong");
        System.out.println("3. Cong nhan");
        System.out.print("Chon kieu nhan vien can them: ");
        int luaChon = new Scanner(System.in).nextInt();
        if (luaChon < 1 || luaChon > 3) {
            return loaiNhanVien();
        }
        return luaChon;
    }

    public NhanVien[] nhapDanhSach() {
        NhanVien[] dsNhanvien = null;
        System.out.print("Nhap so luong nhan vien: ");
        int tongNV = new Scanner(System.in).nextInt();//kiem tra tong nhap vao >0
        dsNhanvien = new NhanVien[tongNV];
        for (int i = 0; i < dsNhanvien.length; i++) {
            int loaiNhanVien = loaiNhanVien();
            switch (loaiNhanVien) {
                case QUAN_LY:
                    dsNhanvien[i] = new QuanLy();
                case NHAN_VIEN_VAN_PHONG:
                    dsNhanvien[i] = new NhanVienVanPhong();
                default:
                    dsNhanvien[i] = new CongNhan();
            }
            System.out.println("Nhap thong tin nhan vien thu " + i);
            dsNhanvien[i].nhapThongTin();
        }

        return dsNhanvien;

    }

    public void hienThongTinNhanVien(NhanVien[] dsNhanVien) {
        if (dsNhanVien != null) {
            for (NhanVien nhanVien : dsNhanVien) {
                if (nhanVien != null) {
                    nhanVien.hienThongTin();
                    System.out.println("------------------------------------");
                }

            }
        } else {
            System.out.println("Danh sach rong");
        }
    }

    // tra ve nhung nhan vien co thu nhap cao nhat theo gioi tinh
    public NhanVien[] timThuNhapTheoGioiTinh(NhanVien[] dsNhanVien, GioiTinh gioiTinh) {
        NhanVien[] dsNhanVienTheoThuNhap = new NhanVien[dsNhanVien.length];
        int count = 0;
        if (dsNhanVien != null) {
            float thuNhapMax = 0;
            for (NhanVien nhanVien : dsNhanVien) {
                if (nhanVien != null && nhanVien.tinhThuNhap() > thuNhapMax && nhanVien.getGioiTinh() == gioiTinh) {
                    thuNhapMax = nhanVien.tinhThuNhap();
                }
            }

            for (NhanVien nhanVien : dsNhanVien) {
                if (nhanVien != null && nhanVien.tinhThuNhap() == thuNhapMax && nhanVien.getGioiTinh() == gioiTinh) {
                    dsNhanVienTheoThuNhap[count] = nhanVien;
                    count++;
                }
            }
        }
        return dsNhanVienTheoThuNhap;
    }

    private int getClassFromObj(NhanVien nv) {
//vi du
//        nv = new QuanLy();
        if (nv instanceof QuanLy) {
            return QUAN_LY;
        }

        if (nv instanceof NhanVienVanPhong) {
            return NHAN_VIEN_VAN_PHONG;
        }
        return CONG_NHAN;
    }

    // tra ve danh sach nhan vien thu nhap cao nhat o moi vi tri
    public NhanVien[] timThuNhapTheoViTri(NhanVien[] dsNhanVien, int loaiNhanVien) {
        NhanVien[] dsNhanVienTheoThuNhap = null;
        int count = 0;
        float thuNhapMax = 0;

        if (dsNhanVien != null) {
            dsNhanVienTheoThuNhap = new NhanVien[dsNhanVien.length];
            for (NhanVien nhanVien : dsNhanVien) {
                if (nhanVien != null) {
                    if (getClassFromObj(nhanVien) == loaiNhanVien && nhanVien.tinhThuNhap() > thuNhapMax) {
                        thuNhapMax = nhanVien.tinhThuNhap();
                    }
                }
            }
            System.out.println("max: " + thuNhapMax);
            for (NhanVien nhanVien : dsNhanVien) {
                if (nhanVien != null && nhanVien.tinhThuNhap() == thuNhapMax && getClassFromObj(nhanVien) == loaiNhanVien) {
                    dsNhanVienTheoThuNhap[count] = nhanVien;
                    count++;
                }
            }
        }
        return dsNhanVienTheoThuNhap;
    }
}
