/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabackend_lab02;

import java.util.regex.Pattern;

/**
 *
 * @author Admin Co0ntructor là ham đc gọi khi khởi tạo object Nếu ko viết mặc
 * định Java sẽ viết hộ( tự thêm vào khi biên dich) 1 contructor rỗng, ko tham
 * số , ko nội dung da viet roi thi lap tuc JAva ko tu them contructor rong nua
 *
 * overload???
 * Bài tập vn: Tạo Class ThayGiao ( ma , ten) sử dụng static, contructor để class ThayGiao chỉ tạo đc 1 obj duy nhất
 * Class VoThayGiao chỉ tạo đc 3 object. Design Pattern 
 */
public class SinhVien {

    public SinhVien() {
        
        //ten ham = ten class
        //ko co kieu tra ve
        System.out.println("dang khoi tao sinh vien");

    }
 

    public SinhVien(int ma, String ten) {
        //ten ham = ten class
        //ko co kieu tra ve
        System.out.println("dang khoi tao sinh vien, truyen vao ma, ten");
        this.ma = ma;
        this.ten = ten;

    }
  

    public SinhVien(int ma, String ten, int tuoi) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public SinhVien(int ma, String ten, int tuoi, int a) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public SinhVien(int ma, String ten, int tuoi, int a, float b) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
    }

//    public static final int a = 10;
    public int ma;
    public String ten;
    public int tuoi;
    public static String tenThayGiao = "Dang Tuan Tu";

    static {
        System.out.println("day la doan code static se chay khi lan dau tien class dc load len bo nho");
    }

    public static void inTenThayGiao() {//ham static chi goi bien tinh

        System.out.println("Thay giao ten là: " + tenThayGiao);
//        SinhVien sv = new SinhVien();
//        System.out.println(this.ma);//ko dc, vì cha biet ma cua thag nao ma in ra
    }

}
