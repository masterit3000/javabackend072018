/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demormiserver;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoRMIServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            MyRemote remote = new MyRemote();
//            remote.tinhTong(0, 0)                
            LocateRegistry.createRegistry(9999);
//            Naming.rebind("rmi://localhost/tinhtoan", remote);
            Naming.rebind("rmi://localhost:9999/tinhtoan", remote);
            System.out.println("Server ok");
        } catch (RemoteException ex) {
            Logger.getLogger(DemoRMIServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(DemoRMIServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
