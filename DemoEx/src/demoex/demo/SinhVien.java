/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoex.demo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class SinhVien {

    private int ma;
    private String ten;
    private int tuoi;

    public int getMa() {
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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) throws TuoiException {

        if (tuoi > 0 && tuoi < 100) {
            this.tuoi = tuoi;
        } else {
            TuoiException tuoiException = new TuoiException();
            throw tuoiException;
        }

    }

}
