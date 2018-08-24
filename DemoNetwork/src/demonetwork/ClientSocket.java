/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demonetwork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 * Lap trinh  doc 1 file trong may va gui sang may khac
 * Lap trình 1 server, nhan duoc nhieu client 
 */
public class ClientSocket {

    public static void main(String[] args) {
        try {
            System.out.println("Dang ket noi toi server....");
            Socket socket = new Socket("localhost", 4567);
            System.out.println("Ket noi thanh cong toi server: " + socket.getPort());
            System.out.println("Ket noi thanh cong toi server: " + socket.getInetAddress().getHostName());
            InetAddress inetAddress = socket.getInetAddress();
//            inetAddress.
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            Thread th = new Thread(new Runnable() {
                @Override

                public void run() {
                    while (true) {
                        try {
                            String readLine = reader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            System.out.println("Server: " + readLine);
                        } catch (IOException ex) {
                            System.out.println("Gap su co ket noi: ");
                            break;
                        }
                    }
                }
            });
            th.start();
            while (true) {
                if (socket.isClosed()) {
                    break;
                }
                String s = new Scanner(System.in).nextLine();
                writer.write(s);
                writer.newLine();
                writer.flush();
            }

            socket.close();//luu y dong trong finaly
        } catch (IOException ex) {
            Logger.getLogger(ClientSocket.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
