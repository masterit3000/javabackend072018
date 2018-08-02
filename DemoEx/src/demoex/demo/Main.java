/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoex.demo;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {

        try {
            System.out.println("nhao vao tuoi");
            int tuoi = new Scanner(System.in).nextInt();
            SinhVien sv = new SinhVien();
            sv.setTuoi(tuoi);
            return;
        } catch (TuoiException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            System.out.println(" kieu j cung vao day chay");//van chay ke ca co return
        }
        System.out.println(" ko return moi chay");///ko chY KHI CO RETURN

    }

}
