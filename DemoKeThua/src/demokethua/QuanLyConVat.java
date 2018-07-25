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
public class QuanLyConVat {

    public void hienThongTin(ConVat[] cvs) {
        //truyen con j vao cung dc, mien ke thua tu conVat
        //va nen cai de ham hienThongTin de hien day du caca thong tin can thiet
        if (cvs != null) {
            System.out.println("danh sach con vat dang quan ly:");
            for (ConVat cv : cvs) {
                if (cv != null) {
                    cv.hienThongTin();
                }
            }
        }
    }

    public void nhapThongTin(ConVat[] cvs) {
        //truyen con j vao cung dc, mien ke thua tu conVat
        //va nen cai de ham hienThongTin de hien day du caca thong tin can thiet
        if (cvs != null) {
            System.out.println("nhap danh sach con vat:");
            for (ConVat cv : cvs) {
                if (cv != null) {
                    cv.nhap();
                }
            }
        }
    }
}
