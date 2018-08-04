/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoDongBo {

    static AtomicInteger laCo = new AtomicInteger(0);//0 la chan chay
    //1 la le chay
//do co 2 thread chi in chan, le nen dung luon la co lam obj chung

    public static void main(String[] args) {
        Thread threadChan = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (laCo) {
                    for (int i = 0; i < 100;) {
                        try {
                            if (laCo.get() == 0) {
                                System.out.println(i);
                                Thread.sleep(33);
                                i += 2;
                                //lam xong viec
                                laCo.set(1);//chuyen co cho thang khac lam
                                laCo.notifyAll();//danh thuc cac thread khac dang ngu do laCo.waitF
                            } else {
                                laCo.wait();//obj chung bat thread dung lai
                            }
                        } catch (InterruptedException ex) {
                            Logger.getLogger(DemoDongBo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        });

        Thread threadLe = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (laCo) {
                    for (int i = 1; i < 100;) {
                        try {
                            if (laCo.get() == 1) {
                                System.out.println(i);
                                Thread.sleep(33);
                                i += 2;
                                //lam xong viec
                                laCo.set(0);//chuyen co cho thang khac lam
                                laCo.notifyAll();//danh thuc cac thread khac dang ngu do laCo.waitF
                            } else {
                                laCo.wait();//obj chung bat thread dung lai
                            }
                        } catch (InterruptedException ex) {
                            Logger.getLogger(DemoDongBo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
//                    laCo.set(0);
//                    laCo.notifyAll();
                }
            }
        });

        threadChan.start();
        threadLe.start();
        NewClass clasccc = new NewClass();
//        clasccc.equals(args)
                
                
    }
}
