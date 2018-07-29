/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democlassvodanh;

/**
 *
 * @author Admin
 */
public class TestNhanVienCtrl {

    public static void main(String[] args) {
        INhanVienCtrl nhanVienCtrl = new NhanVienCtrl();
        INhanVien[] dsnv = nhanVienCtrl.taoDanhSach();
        nhanVienCtrl.hienDanhSach(dsnv);
    }

}
