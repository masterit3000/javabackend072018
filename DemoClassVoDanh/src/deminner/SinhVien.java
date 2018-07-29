/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deminner;

/**
 *
 * @author Admin
 */
public class SinhVien {

    private int ma;
    private String ten;

    class SinhVienNamNhat {

        private int tuoi;

        public void hienThongtin() {
            System.out.println("tuoi = " + this.tuoi);
            System.out.println("ma = " + ma);
            System.out.println("ten = " + ten);
        }
    }

    public static void main(String[] args) {

        SinhVien sv = new SinhVien();
        sv.ma = 1;
        sv.ten = "aaaa";
        SinhVienNamNhat svnn = sv.new SinhVienNamNhat();
//        svnn: là 1 obj nằm trong sv
        svnn.hienThongtin();

    }

}
