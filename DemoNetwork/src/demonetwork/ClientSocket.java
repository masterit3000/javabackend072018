/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demonetwork;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ClientSocket {

    public static void main(String[] args) {
        try {
            System.out.println("Dang ket noi toi server....");
            Socket socket = new Socket("localhost", 4567);
            System.out.println("Ket noi thanh cong toi server: " + socket.getPort());
            System.out.println("Ket noi thanh cong toi server: " + socket.getInetAddress().getHostName());

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            while (true) {
                String s = new Scanner(System.in).nextLine();
                writer.write(s);
                writer.newLine();
                writer.flush();
            }

        } catch (IOException ex) {
            Logger.getLogger(ClientSocket.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
