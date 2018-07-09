/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuabaitaplab1;

/**
 *
 * @author Admin
 */
public class ChuaBaiTapLab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        KhachHang kh1 = new KhachHang();
        KhachHang kh2 = new KhachHang();
        kh1.nhapDuLieu();
        kh2.nhapDuLieu();
        int soSanhNgaySinh = kh1.soSanhNgaySinh(kh2);
        switch (soSanhNgaySinh) {
            case ThoiGian.LON_HON:
                System.out.println("Khac hang 1 nho tuoi hon");
                break;
            case ThoiGian.NHO_HON:
                System.out.println("Khac hang 1 lon tuoi hon");
                break;
            case ThoiGian.BANG_NHAU:
                System.out.println("2 Khac hang bang tuoi");
                break;

        }
    }

}
