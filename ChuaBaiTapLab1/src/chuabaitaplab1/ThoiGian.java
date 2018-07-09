/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuabaitaplab1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ThoiGian {

    public static final int BANG_NHAU = 0;
    public static final int LON_HON = 1;
    public static final int NHO_HON = -1;
    public int ngay;
    public int thang;
    public int nam;

    public void nhapDuLieu() {

        System.out.println("moi nhap ngay thang nam");
        this.ngay = new Scanner(System.in).nextInt();
        this.thang = new Scanner(System.in).nextInt();
        this.nam = new Scanner(System.in).nextInt();

    }

    public void hienThongTin() {
        System.out.println(ngay + "/" + thang + "/" + nam);
    }

    public int soSanh(ThoiGian tg) {//quy uoc bang nhau = 0. nho hon tra ve <0, lon hon tra ve >0
        //quy uoc bang nhau = 0. nho hon tra ve -1, lon hon tra ve 1

        if (tg != null) {
            if (this.nam != tg.nam) {
                return (this.nam - tg.nam > 0) ? LON_HON : NHO_HON;
            }
            if (this.thang != tg.thang) {
                return (this.thang - tg.thang) > 0 ? 1 : -1;
            }
            if (this.ngay != tg.ngay) {
                return this.ngay - tg.ngay > 0 ? 1 : -1;
            }

            return BANG_NHAU;
        }
        return 1;
    }
}
