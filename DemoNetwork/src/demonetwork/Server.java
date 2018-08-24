/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demonetwork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            ServerSocket serverSocket = new ServerSocket(4567);
            System.out.println("Dang cho client....");
            Socket socket = serverSocket.accept();//server se cho clietn ket noi toi
            System.out.println("Client ket noi thanh cong: " + socket.getInetAddress().getHostName());
            System.out.println("Client ket noi thanh cong: " + socket.getPort());
//            InputStream inputStream = socket.getInputStream();
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
                            System.out.println("Client: " + readLine);
                        } catch (IOException ex) {
                            System.out.println("Gap su co ket noi: ");
                            break;
                        }
                    }
                }
            });
            th.start();

            while (true) {
                String s = new Scanner(System.in).nextLine();
                writer.write(s);
                writer.newLine();
                writer.flush();
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
