/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoDocGhiObj {
    
    public static void main(String[] args) {
//        PrintStream ps = new PrintStream("aaa.txt");
//        ps.print(4.5);
    }

    public static void docObj(String[] args) {
        
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("sv.dat"));
            Object readObject = ois.readObject();
            System.out.println(readObject);
            if (readObject instanceof SinhVien) {
                
                SinhVien sv = (SinhVien) readObject;
                System.out.println(sv);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoDocGhiObj.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DemoDocGhiObj.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DemoDocGhiObj.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoDocGhiObj.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void ghiObj(String[] args) {
        
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("sv.dat"));
            SinhVien sv = new SinhVien(1, "aaaaaaaaaa");
            oos.writeObject(sv);
            System.out.println("ok ok");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoDocGhiObj.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DemoDocGhiObj.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoDocGhiObj.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
