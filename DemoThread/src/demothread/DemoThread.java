/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyThread myThread = new MyThread();
        myThread.start();//lap tuc he thong tao ra 1 thread #main va goi run chay trong thread do
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        Thread threadD = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    System.out.println("a");
                    Thread.sleep(20);
                } catch (InterruptedException ex) {
                    Logger.getLogger(DemoThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        threadD.start();
        

    }

}
