/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democollectionssss;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 *
 * @author Admin
 */
public class MapDemo {

    public static void main(String[] args) {

        Map map = new HashMap();

        map.put("key", "phan tu dc them vao");
        map.put("key1", "phan tu dc them vao");
        map.put(45, "phan tu dc them vao 45 ");
        map.put(4.5, "phan tu dc them vao");

        System.out.println(map.get(45));

        Map<String, SinhVien> mapSV = new HashMap<>();

        mapSV.put("01", new SinhVien(1, "khong khong 1"));
        mapSV.put("02", new SinhVien(2, "khong khong 2"));
        mapSV.put("03", new SinhVien(3, "khong khong 3"));
        mapSV.put("04", new SinhVien(4, "khong khong 4"));

        mapSV.forEach(new BiConsumer<String, SinhVien>() {
            @Override
            public void accept(String key, SinhVien value) {
                System.out.println(key + " - " + value);

            }
        });

        Set<String> keySet = mapSV.keySet();//danh sách các key trong map
        for (String key : keySet) { //lap trne mang key va lay ra tugn key
            SinhVien value = mapSV.get(key);

        }

    }
}
