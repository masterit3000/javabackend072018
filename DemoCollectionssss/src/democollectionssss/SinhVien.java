/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democollectionssss;

/**
 *
 * @author Admin
 */
public class SinhVien implements Comparable<SinhVien> {

    private int ma;
    private String ten;

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

    public SinhVien() {
    }

    public SinhVien(int ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    @Override
    public int compareTo(SinhVien o) {

        return this.ma - o.ma;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "ma=" + ma + ", ten=" + ten + '}';
    }

}
