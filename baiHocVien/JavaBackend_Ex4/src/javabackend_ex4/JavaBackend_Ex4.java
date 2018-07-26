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
public class JavaBackend_Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        ChucNang chucNang = new ChucNang();
//
//        while (true) {
//            System.out.println("1. Nhap");
//            System.out.println("2. Hien thi");
//            System.out.println("3. Tim nhan vien co thu nhap cao");
//            System.out.println("4. Thoat");
//            System.out.print("Chon chuc nang: ");
//            int luaChon = new Scanner(System.in).nextInt();
//
//            switch (luaChon) {
//                case 1:
//                    chucNang.nhapDanhSach();
//                    break;
//                case 2:
//                    chucNang.hienDanhSach();
//                    break;
//                case 3:
//                    System.out.println("\tLua chon tim kiem 1=>Gioi tinh, 2=>Vi tri");
//                    int timKiem = new Scanner(System.in).nextInt();
//                    chucNang.luaChonTimKiem(timKiem);
//                    break;
//                case 4:
//                    System.exit(0);
//                default:
//                    System.out.println("Nhap sai, nhap lai: ");
//            }
//        }

        Menu menu = new Menu();
        menu.hienMenuChinh();
    }

}
