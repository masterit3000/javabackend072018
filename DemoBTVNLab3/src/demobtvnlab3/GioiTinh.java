/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demobtvnlab3;

/**
 *
 * @author Admin
 */
public enum GioiTinh {

    NAM(1, "Con trai"), NU(0, "Con gai"), KXD(-1, "Khong xac dinh");

    private GioiTinh(int code, String ten) {
        this.code = code;
        this.ten = ten;
    }
    private int code;
    private String ten;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public static GioiTinh getbyCode(int code) {

        switch (code) {
            case 1:
                return NAM;
            case 0:
                return NU;

            default:
                return KXD;
        }
    }

}
