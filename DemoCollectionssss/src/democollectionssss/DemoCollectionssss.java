/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democollectionssss;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Admin
 */
public class DemoCollectionssss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List list = new ArrayList();
        list.add("aaaaa");
        list.add("aaaaa");
        list.add("676756");
        list.add("aaaaa");
        list.add("aaaaa");
        list.add("aaaaa");
        list.add(45);
        list.add(44.5);

        for (int i = 0; i < list.size(); i++) {
            Object get = list.get(i);
            if (get instanceof String) {
                String s = (String) get;
                System.out.println("s = " + s);
            } else {
                System.out.println(get);
            }

        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        for (Object obj : list) {
            System.out.println(obj);
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        list.forEach((Object t) -> {
            System.out.println("a = " + t.toString());
        } //list se lay ra tung phan tu trong mang, sau do goi accept chay và truyen vào phan tu do
        //accept chay j, ntn la do de  viet
        );
        //danh dau cho lisst ( set...) chi nhan vao 1 kieu du lieu tuong ung

        List<String> strings = new ArrayList<>();
        strings.add("sdsadsad");
        strings.add("sdsadsad");
        strings.add("sdsadsad");
        for (String string : strings) {
            System.out.println(string);
        }
//        strings.add(45);

    }

}
