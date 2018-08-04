/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoExecutor {

    public static void main(String[] args) {

        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);//chi tao ra 3 luong trong he thong
        newFixedThreadPool.submit(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                    Thread.sleep(30);
                } catch (InterruptedException ex) {
                    Logger.getLogger(DemoExecutor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        newFixedThreadPool.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        System.out.println("ccccccccccccccccccccccccc");
                        Thread.sleep(30);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(DemoExecutor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });

        newFixedThreadPool.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        System.out.println("bbbbbbbbbbbbbbbbbbbbbb");
                        Thread.sleep(30);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(DemoExecutor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });

        newFixedThreadPool.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        System.out.println("ddddddddddddddddddd");
                        Thread.sleep(30);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(DemoExecutor.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });

        Future<String> future = newFixedThreadPool.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {//giong ham run
                for (int i = 0; i < 10; i++) {
                    System.out.println("eeeeeeeeee");
                }
                return "ok ok ";
            }
        });

        try {
            //main se hung ve cai ok ok
            String get = future.get();//ham nay se cho khi nao call o trong thread kia chay xong thi moi chay va tra ve ket qua
            System.out.println("ket qua tu call: " + get);
        } catch (InterruptedException ex) {
            Logger.getLogger(DemoExecutor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(DemoExecutor.class.getName()).log(Level.SEVERE, null, ex);
        }

        newFixedThreadPool.shutdown();

    }
}
///cho thay ti
