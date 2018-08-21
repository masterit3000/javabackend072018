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
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        OutputStream os = null;
        try {
            os = new FileOutputStream("data.txt", true);
            for (int i = 0; i < 10000; i++) {
                String s = "aaaaaaaaaaaaaaaa";
                os.write(s.getBytes());
                 s = "aaaaaaaaaaaaaaaa";
                os.write(s.getBytes());
                 s = "aaaaaaaaaaaaaaaa";
                os.write(s.getBytes());
            }
            System.out.println("ok ok");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DemoIO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                os.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoIO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void docfile(String[] args) {
        InputStream is = null;
        try {
            // TODO code application logic here
            is = new FileInputStream("data.txt");
            while (true) {
                int read = is.read();
//            if (read == -1) {
                if (is.available() == 0) {
                    break;
                }
                char c = (char) read;
                System.out.print(c);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DemoIO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                is.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoIO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
