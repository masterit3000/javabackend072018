/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demokethua;

/**
 *
 * @author Admin
 */
public class DemoKeThua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ConCho cho1 = new ConCho();
        cho1.setMa(1);
        cho1.setTen("con cho con");
        cho1.setTriKhon(10);
        cho1.hienThongTin();

        ConGa ga1 = new ConGa();

        ConVat cv1 = new ConCho();
        System.out.println("Thoong tin cv1:");
        cv1.hienThongTin();
//        cv1.setTriKhon();
        ConCho ch2 = (ConCho) cv1;//ep kieu chi thanh cong khi ban chat cv1 la con Chos
        cv1 = new ConGa();
        cv1.hienThongTin();//hienthogn tin cua con ga

        ConCho[] dsCho = new ConCho[2];
        dsCho[0] = new ConCho(1, 1, "1111");
        dsCho[1] = new ConCho(10, 2, "2222");
        QuanLyConVat qlcv = new QuanLyConVat();
        qlcv.hienThongTin(dsCho);
        System.out.println("****************************");
        ConVat[] dscv = new ConVat[2];
        dscv[0] = new ConCho(9, 3, "33333333333333");
        dscv[1] = new ConGa(4f, 4, "con ga 44444444");
        qlcv.hienThongTin(dscv);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        //con cho thi ok, co viet ham nhap
        //conm ga cu chuoi vi ko viet ham nhap
        ConCho cv2 = new ConCho();
        cv2.nhap();//ok
        ConGa cg = new ConGa();
        cg.nhap();//chay ham convat, -> ko dung, vi con Con con co can  nang
        
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        qlcv.nhapThongTin(dscv);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        qlcv.nhapThongTin(dsCho);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        
//        ConVat sv = new ConVat(0);//ko dcc, vi neu dc thi khi goi ham nhap biet chay cai j??
//abtract class ko dc new obj, khai bao van dc

    }

}
