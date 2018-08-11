/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democollectionssss;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

/**
 *
 * @author Admin
 */
public class DemoSet {

    public static void main(String[] args) {

        Set set = new HashSet();
        set.add("aaaaaaa");
        set.add("aaaaaaa");
        set.add("aaaaaaa");
        set.add("aaaaaaa");
        set.add("aaaaaae4");

        for (Object object : set) {
            System.out.println(object);
        }

        set.forEach(new Consumer() {
            @Override
            public void accept(Object t) {

            }
        });
        //itor
        Iterator iterator = set.iterator();//co kha nang tro toi tung phan tu callection
        while (true) {
            if (iterator.hasNext()) {

                Object next = iterator.next();//lkay ra phan tu dau tien
            } else {
                break;
            }

        }

        Set<SinhVien> setSinhVien = new TreeSet<>();
//        Set<SinhVien> setSinhVien = new HashSet<>();
        setSinhVien.add(new SinhVien(1, "SADSA Á "));
        setSinhVien.add(new SinhVien(1, "SADSA Á "));
        setSinhVien.add(new SinhVien(1, "SADSA Á "));
        setSinhVien.add(new SinhVien(1, "SADSA Á "));

//        for (SinhVien sinhVien : setSinhVien) {
//
//        }
        Iterator<SinhVien> itSv = setSinhVien.iterator();

        while (true) {
            if (itSv.hasNext()) {
                SinhVien next = itSv.next();
                System.out.println(next);
            } else {

                break;
            }
        }
    }

}
