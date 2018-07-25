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
public abstract class ConVat {

    private int ma;
    private String ten;

    public ConVat(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public final int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void hienThongTin() {
        System.out.println("Ma = " + this.ma);
        System.out.println("Ten = " + this.ten);
    }

    //da la con vat thi phai co ham nhap, 
    // nhung da nhap thi phai cho nhap du thong tin
    //the nen ham nay vua phai viet o con vat, vua phai viet o cac class con khacs ( ConCho, ConGa
    //=> cha chi khai bao ham nhap, chu o viet noi dung -> abstract  method, ham ao
    public abstract void nhap();
//    public void nhap() {
//        System.out.println("nhap ma");
//        System.out.println("nhap ten");
//    }

}
