/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nnnnnnnio;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoPath {

    public static void main(String[] args) {

        Path path = Paths.get("D:");
//        System.out.println(path.toFile().getAbsolutePath());
        Iterator<Path> iterator = path.iterator();
        while (iterator.hasNext()) {
            Path next = iterator.next();
            System.out.println(next.toFile().getName());
        }
        Path resolve = path.resolve("abc.txt");
        try {
            List<String> readAllLines = Files.readAllLines(Paths.get("data.txt"), Charset.defaultCharset());
            for (String readAllLine : readAllLines) {
                System.out.println(readAllLine);
            }
        } catch (IOException ex) {
            Logger.getLogger(DemoPath.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        Files.copy(resolve, out)
    }
}
