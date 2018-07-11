/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoenum;

/**
 *
 * @author Admin
 */
public enum ThuTrongTuan {

    CHU_NHAT(0, "Chu nhat"), THUHAI(1, "thu hai"), THUBA(2), THUTU(3), THUNAM(4), THUSAU(5), THUBAY(6);

    private int ma;
    private String tenTiengViet;

    private ThuTrongTuan(int ma) {
        System.out.println("dang khoi tao obj Thu trong tuan, ma ==" + ma);
        this.ma = ma;
    }

    private ThuTrongTuan(int ma, String tenTiengViet) {
        this.ma = ma;
        this.tenTiengViet = tenTiengViet;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getMa() {
        return ma;
    }

    public void setTenTiengViet(String tenTiengViet) {
        this.tenTiengViet = tenTiengViet;
    }

    public String getTenTiengViet() {
        return tenTiengViet;
    }

    
    public void inThongTin(){
    
        System.out.println(ma+" - "+tenTiengViet);
    }
}
