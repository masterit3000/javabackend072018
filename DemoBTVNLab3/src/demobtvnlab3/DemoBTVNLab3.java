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
public class DemoBTVNLab3 {

    /**
     * @param args the command line arguments MVC
     */
    public static void main(String[] args) {
        // TODO code application logic here

        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        NhanVien[] ds = null;
        
        while (true) {
            System.out.println("1. nhap");
            System.out.println("2. Hien");
            System.out.println("3. Tim kiem va sap xep");
            System.out.println("4. Thoat");
            int chon = new Scanner(System.in).nextInt();
            switch (chon) {
                case 1:
                    ds = qlnv.nhapDanhSachNhanVien();
                    break;
                //chua chon 1 ko cho chon 2, 3
                case 2:
                    qlnv.hienDanhSach(ds);
                    break;
                case 3:
                    System.out.println("Chon gioi tnh muon tim; 1=Nam  0 =Nu, # = KXD");
                    int gt = new Scanner(System.in).nextInt();
                    GioiTinh gioiTinh = GioiTinh.getbyCode(gt);
                    NhanVien[] kq = qlnv.timTheoGioiTinh(ds, gioiTinh);
                    qlnv.hienDanhSach(kq);
                    break;
                case 4:
                    System.out.println("bye bye");
                    System.exit(0);
                default:
                    System.out.println("Chon sai moi chon lai");
            }
        }
    }
    
}
