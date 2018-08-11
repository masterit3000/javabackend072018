/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democollectionssss.thaotac;

import democollectionssss.SinhVien;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DemoThaoTac {

    public static void main(String[] args) {

        List<SinhVien> list = new ArrayList<>();

        list.add(new SinhVien(1, "aaaaaaaa"));
        list.add(new SinhVien(2, "bbbbbb"));
        list.add(new SinhVien(3, "nnnnnnnnn"));
        list.add(new SinhVien(5, "abbbaa"));
        list.add(new SinhVien(4, "xxxx"));

        Collections.sort(list, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });

//        Collections.
        for (SinhVien sinhVien : list) {
            System.out.println(sinhVien);
        }
    }

}
