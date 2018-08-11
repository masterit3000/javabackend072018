/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democollectionssss.stream;

import democollectionssss.SinhVien;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author Admin
 */
public class DemoStream {

    public static void main(String[] args) {
        List<SinhVien> list = new ArrayList<>();

        list.add(new SinhVien(1, "aaaaaaaa"));
        list.add(new SinhVien(2, "bbbbbb"));
        list.add(new SinhVien(3, "nnnnnnnnn"));
        list.add(new SinhVien(5, "abbbaa"));
        list.add(new SinhVien(4, "xxxx"));
//chi lay sv co ma le
        list.stream().filter((t) -> {
            System.out.println("dang loc sinh vien");
            return t.getMa() % 2 == 1;
        }).forEach(System.out::println);

        Optional<SinhVien> findFirst = list.stream().findFirst();
        //neu tra ve  1 obj sinh vien, khi su dung obj do chung ta phai kiem tra, #null ....
        SinhVien get = findFirst.orElse(new SinhVien(0, "sinh vien mac dinh"));//neu ko co data ( null) thi tra ve sv mac dinh
        System.out.println("first:" + get);

        list.stream().map(new Function<SinhVien, String>() {
            @Override
            public String apply(SinhVien t) {
                return "ma=" + t.getMa() + " | ten=" + t.getTen();
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        });

        ArrayList collect = list.stream().collect(new Collector<SinhVien, String, ArrayList>() {
            @Override
            public Supplier<String> supplier() {
                return new Supplier<String>() {
                    @Override
                    public String get() {
                        return "aa";
                    }
                };
            }

            @Override
            public BiConsumer<String, SinhVien> accumulator() {
                return (String t, SinhVien u) -> {
                };
            }

            @Override
            public BinaryOperator<String> combiner() {
                return (String t, String u) -> "bbbbbbbbbb";
            }

            @Override
            public Function<String, ArrayList> finisher() {
                return (String t) -> {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("aa");
                    arrayList.add("bb");
                    arrayList.add("cc");
                    return arrayList;
                };

            }

            @Override
            public Set<Collector.Characteristics> characteristics() {
                HashSet<Collector.Characteristics> hashSet = new HashSet<>();
                hashSet.add(Characteristics.CONCURRENT);
                return hashSet;
            }

        });
        collect.forEach(new Consumer() {
            @Override
            public void accept(Object t) {
                System.out.println("ccc: " + t);
            }
        });

        List<SinhVien> collect1 = list.stream().sorted(new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getMa() - o2.getMa();
            }
        }).collect(Collectors.toList());
    }
}
