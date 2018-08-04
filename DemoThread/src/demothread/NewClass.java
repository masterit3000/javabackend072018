/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread;

import java.lang.reflect.Method;

/**
 *
 * @author Admin class ten la Class vi tat ca cac class deu la class nen co 1
 * class ten la Class sinh ra de dai dien cho cac class khi do moi class la 1
 * obj cua class Class BTVN: viet chuong trinh co 3 thread Thread A sinh ra 1 so
 * A ngau nhien Thread B sinh ra 1 so B ngau nhien Thread C tinh tong A+B neu có
 * the thì làm đồng bộ, ko thì làm như bình thường mỗi thread in 100 số
 */
public class NewClass {

    @Override
    public String toString() {
        return super.toString() + " day la class NewClasssss"; //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {

        NewClass nc = new NewClass();
        System.out.println(nc);
        Class aClass = nc.getClass();
        System.out.println(aClass.getName());
        System.out.println(aClass.getConstructors().length);
        System.out.println(aClass.getMethods().length);
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        System.out.println("pack:" + aClass.getPackage());

    }
}
