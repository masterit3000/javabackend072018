/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demourl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoURL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here

            URL url = new URL("https://vnexpress.net/");
            URLConnection openConnection = url.openConnection();
            openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
            InputStream openStream = openConnection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(openStream));
            while (true) {
                String readLine = reader.readLine();
                if (readLine == null) {
                    break;
                }
                System.out.println(readLine);
            }
            
            //jsoup
        } catch (MalformedURLException ex) {
            Logger.getLogger(DemoURL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DemoURL.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
