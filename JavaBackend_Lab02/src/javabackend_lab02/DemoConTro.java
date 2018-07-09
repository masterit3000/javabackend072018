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
public class DemoConTro {

    static {
        System.out.println("aaaaaaaaaaaaaaaaa");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVien sv1 = new SinhVien();
        sv1.ma = 1;
        sv1.ten = "Sinh vien 1";
        sv1.tuoi = 19;
        SinhVien sv2 = sv1;
        sv2.tuoi = 20;
        sv1.ten = "aaaaaaaaaa";
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println("sv2.ma" + sv2.ma); //vi han sv2 = sv1 nen s2.ma = 1
        System.out.println("sv2.ten" + sv2.ten);//sv2.ten = sinh vien 1
        System.out.println("sv2.tuoi" + sv2.tuoi);//sv2.tuoi - 20
        System.out.println("sv1.tuoi" + sv1.tuoi);//sv2.tuoi - 20

        tangTuoiLenMot(sv1.tuoi);
        System.out.println("sau khi tang");
        System.out.println("sv1.tuoi" + sv1.tuoi);//sv2.tuoi - 20
        tangTuoiLenMot(sv1);
        System.out.println("sau khi tang lan 2");
        System.out.println("sv1.tuoi" + sv1.tuoi);//sv2.tuoi - 20

    }

    public static void tangTuoiLenMot(int tuoi) {//tham tri -=> truyen vao gia tri

        tuoi = tuoi + 1;
    }

    public static void tangTuoiLenMot(SinhVien sv) {//tham chieu - > truyen vao dia chi, con tro

        sv.tuoi = sv.tuoi + 1;
    }

}
