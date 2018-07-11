/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabackend.chuabailab2;

/**
 *
 * @author Admin
 */
public class ThayGiao {

    public int ma;
    public String ten;

    private ThayGiao() {
    }

    private static ThayGiao tg;

    public static ThayGiao taoobj() {
        if (tg == null) {
            tg = new ThayGiao();
        }
        return tg;
    }

}
