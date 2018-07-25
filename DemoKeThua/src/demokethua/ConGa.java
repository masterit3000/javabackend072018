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
public class ConGa extends ConVat {

    public ConGa() {
        super(0, null);
    }

    public ConGa(float conNang, int ma, String ten) {
        super(ma, ten);
        this.conNang = conNang;
    }

    private float conNang;

    public float getCanNang() {
        return conNang;
    }

    public void setCanNang(float conNang) {
        this.conNang = conNang;
    }

    @Override
    public void hienThongTin() {
        super.hienThongTin(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("day la con ga, can nang:" + this.getCanNang());
    }

    @Override
    public void nhap() {
        System.out.println("nhap con gaaaaaaaaa");
    }

}
