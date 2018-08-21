/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoio;

import java.io.File;

/**
 *
 * @author Admin
 */
public class DemoFileClass {

    public static void main(String[] args) {

        File f = new File("D:");
        System.out.println(f.isDirectory());
        File[] listFiles = f.listFiles();
        for (File listFile : listFiles) {
            System.out.println(listFile.getName());
        }
    }
}
