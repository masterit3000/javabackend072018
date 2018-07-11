/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botutruycap;

/**
 *
 * @author Admin
 */
public class GiangVien {

//    private int id;
    private int Ma;
    private String name;
    private int tuoi;

    public GiangVien() {
    }

    public GiangVien(int Ma, String name, int tuoi) {
        this.Ma = Ma;
        this.name = name;
        this.tuoi = tuoi;
    }
    public GiangVien(int Ma, String name) {
        this.Ma = Ma;
        this.name = name;
        this.tuoi = tuoi;
    }
    
    

    public int layVetuoi() {

        return this.tuoi;
    }

    public void ganTuoi(int ma) {
        if (ma < 20 || ma > 100) {
            System.out.println("Tuoi ko hop le");
            return;
        }
        this.tuoi = ma;
    }

    public int getMa() {//co thuoc tinh ma
        return Ma;
    }

    public void setMa(int ma) {
        this.Ma = ma;
    }

    public String getTen() {
        return "sfsdfdsfsdfdsfds";
    }

    public void setTen(String ten) {
        this.name = ten;
    }

    public int getAge() {//co thuoc tinh age, nhung day la thuoc tinh chi doc
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        //co setTuoi -> co thuoc tinh tuoi, day la thuoc tinh chi ghi
        if (tuoi < 20 || tuoi > 100) {
            System.out.println("Tuoi ko hop le");
            return;
        }
        this.tuoi = tuoi;
    }

}
