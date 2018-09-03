/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demormiserver;

import com.demo.rmi.IMyRemote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Admin
 */
public class MyRemote extends UnicastRemoteObject implements IMyRemote {

    public MyRemote() throws RemoteException {
    }

    @Override
    public int tinhTong(int a, int b) throws RemoteException {
//API
        System.out.println("dang chay ham tinh tong");
        return a + b;
    }

}
