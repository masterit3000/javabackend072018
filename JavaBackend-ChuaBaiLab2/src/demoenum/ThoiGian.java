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
public class ThoiGian {

    public static final int CHU_NHAT = 0;
    public static final int THU_HAI = 1;
    public static final int THU_BA = 2;
    public static final int THU_TU = 3;

    private int thuTrongTuan;

    public ThoiGian() {
    }

    public void setThuTrongTuan(int thuTrongTuan) {
        this.thuTrongTuan = thuTrongTuan;
    }

    public int getThuTrongTuan() {
        return thuTrongTuan;
    }

    public void inThongTin() {

        switch (thuTrongTuan) {
            case CHU_NHAT:
                System.out.println("hom nay la chu nhat");
                break;
            case THU_BA:
                System.out.println("hom nay la thu ba");
                break;
            case THU_HAI:
                System.out.println("hom nay la thu hai");
                break;
            default:
                throw new AssertionError();
        }
    }

}
