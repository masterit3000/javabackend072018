/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabackend.chuabailab2;

import botutruycap.SinhVien;

/**
 *
 * @author Admin
 */
public class JavaBackendChuaBaiLab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        ThayGiao tg1 = new ThayGiao();
        ThayGiao tg2 = ThayGiao.taoobj();
        ThayGiao tg3 = ThayGiao.taoobj();
        ThayGiao tg4 = ThayGiao.taoobj();
        ThayGiao tg5 = ThayGiao.taoobj();
        tg2.ma = 99;
        System.out.println(tg3.ma);
        System.out.println(tg4.ma);
        System.out.println(tg5.ma);

        SinhVien sv = new SinhVien();
//        sv.
        VoThayGiao vtg = VoThayGiao.layVeObj();

    }

}
