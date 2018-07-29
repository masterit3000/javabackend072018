/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democlassvodanh;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author Admin
 */
public class NhanVienCtrl implements INhanVienCtrl {

    private int maFake = 1;
    private String tenFake = "aaaaaaaa";
    private int i = 0;

    @Override
    public INhanVien[] taoDanhSach() {
        int soLuong = 2;
        INhanVien[] viens = new INhanVien[soLuong];
        for (i = 0; i < viens.length; i++) {

            viens[i] = new INhanVien() {
                @Override
                public void nhap() {
                    System.out.println("aaaaaaaaaaaaaa");
                }

                @Override
                public void hien() {
                    System.out.println("ma =" + maFake);
                    System.out.println("ten =" + tenFake);
                    System.out.println("bbbbbbbbbbbbbbbbbbbbbbb: " + i);
                }
            };

            viens[i].nhap();
        }
        return viens;
    }

    @Override
    public void hienDanhSach(INhanVien[] ds) {
        if (ds != null) {
            for (INhanVien d : ds) {
                d.hien();
            }
            Stream<INhanVien> stream = Arrays.stream(ds);
            stream.forEach(new Consumer<INhanVien>() {
                @Override
                public void accept(INhanVien t) {
                    //t chinh la tung phan tu cua mang nhanvien
                    t.hien();
                }
            });

            stream = Arrays.stream(ds);
            stream.forEach((INhanVien t) -> {
                //t chinh la tung phan tu cua mang nhanvien
                t.hien();
            });

            stream = Arrays.stream(ds);
            stream.filter((t) -> t.equals("aa")).forEach(INhanVien::hien);

        }
    }

//    class NhanVienDemo implements INhanVien {
//
//        @Override
//        public void nhap() {
//            System.out.println("nhap nhan vien demo");
//        }
//
//        @Override
//        public void hien() {
//            System.out.println("hiennnn nhan vien demo");
//        }
//
//    }
}
