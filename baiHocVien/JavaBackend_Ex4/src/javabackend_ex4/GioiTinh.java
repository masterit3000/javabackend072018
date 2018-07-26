/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabackend_ex4;

/**
 *
 * @author DatPT
 */
public enum GioiTinh {
    NAM(1, "Nam"), NU(0, "Nu"), KXD(-1, "Khong xac dinh");

    private int ma;
    private String chu;

    private GioiTinh(int ma, String chu) {
        this.ma = ma;
        this.chu = chu;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getChu() {
        return chu;
    }

    public void setChu(String chu) {
        this.chu = chu;
    }

    public static GioiTinh layMaGioiTinh(int maGioiTinh) {
        switch (maGioiTinh) {
            case 1:
                return NAM;
            case 0:
                return NU;
            default:
                return KXD;
        }
    }

}
