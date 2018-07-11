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
public class ThoiGianXin {

    private ThuTrongTuan thu;

    public ThuTrongTuan getThu() {
        return thu;
    }

    public void setThu(ThuTrongTuan thu) {
        this.thu = thu;
    }

    public static void main(String[] args) {
        ThoiGianXin tgx = new ThoiGianXin();
        tgx.setThu(ThuTrongTuan.THUBAY);
        System.out.println(tgx.getThu().getMa());
        tgx.setThu(ThuTrongTuan.CHU_NHAT);
        System.out.println(tgx.getThu().getTenTiengViet());
        tgx.getThu().inThongTin();
        tgx.getThu().setMa(8);
        tgx.getThu().inThongTin();
//
//        switch (tgx.getThu()) {
//            case CHU_NHAT:
//
//                break;
//            default:
//                throw new AssertionError();
//        }
    }
}
