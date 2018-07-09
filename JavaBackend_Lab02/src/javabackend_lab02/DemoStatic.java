/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabackend_lab02;

/**
 *
 * @author Admin
 */
public class DemoStatic {

    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        SinhVien sv3 = new SinhVien();

        System.out.println(sv1.tenThayGiao);
        System.out.println(sv2.tenThayGiao);
        System.out.println(sv3.tenThayGiao);
        sv1.tenThayGiao = "Dang Tuan Ti";
        System.out.println(sv1.tenThayGiao);
        System.out.println(sv2.tenThayGiao);
        System.out.println(sv3.tenThayGiao);
        System.out.println(SinhVien.tenThayGiao);
        SinhVien.inTenThayGiao();

        SinhVien sv4 = new SinhVien(12, "sinh vien 4");
        System.out.println(sv4.ma);
        System.out.println(sv4.ten);
    }
}
