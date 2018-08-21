/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin viet code copy tu file A -> file B
 */
public class DemoReaderWrite {

    public static void main(String[] args) {

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("data.txt"));
            String s = "vvvvvvvvvvvvvvvvvvv";
            for (int i = 0; i < 10000; i++) {
                writer.write(s);
                writer.newLine();
                writer.write(s);
                writer.newLine();
                writer.write(s);
                writer.newLine();
                writer.write(s);
            }
            System.out.println("ok ok ");
        } catch (IOException ex) {
            Logger.getLogger(DemoReaderWrite.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoReaderWrite.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static void docfile(String[] args) {

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream("data.txt")));
//            reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                String readLine = reader.readLine();
                if (readLine == null) {
                    break;
                }
                System.out.println(readLine);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoReaderWrite.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DemoReaderWrite.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(DemoReaderWrite.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
