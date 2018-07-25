/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demokethua;

/**
 *
 * @author Admin contructor cua class con phai goi contructor cua class cha ko
 * goi, tu he thong se con contructor rong cua cha de chay
 */
public class ConCho extends ConVat {

    public ConCho() {
        super(0, null);//phai coi contructor cua cha
    }

    public ConCho(int triKhon, int ma, String ten) {
        super(ma, ten);
        this.triKhon = triKhon;
    }

//    private int ma;
//    private String ten;
    private int triKhon;

    public int getTriKhon() {
        return triKhon;
    }

    public void setTriKhon(int triKhon) {
        this.triKhon = triKhon;
    }

    @Override
    public void hienThongTin() {
//        System.out.println("Ma = " + this.getMa());
//        System.out.println("Ten = " + this.ten);
        super.hienThongTin();//goi den ham hien thong tin cua class Cha
        System.out.println("day la con cho: ");
        System.out.println("tri khon: " + this.triKhon);

    }

//    @Override
//    public int getMa() {
//        return 1;
//    }
//    @Override
    public void nhap() {
        System.out.println("nhap thong tin con cho");
//        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("nhap ma");
        System.out.println("nhap ten");
        System.out.println("nhap tri khon");
    }
}
