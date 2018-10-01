/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democtrl;

/**
 *
 * @author Admin
 */
public class SinhVienDTO {

    private int ma;
    private String ten;
    private String ngaysinh;

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

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public SinhVienDTO() {
    }

    public SinhVienDTO(int ma, String ten, String ngaysinh) {
        this.ma = ma;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
    }
    
    
}
