/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demormiclient;

import com.demo.rmi.IMyRemote;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DemoRMIClient {

    /**
     * @param args the command line arguments// EJB
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            IMyRemote lookup = (IMyRemote) Naming.lookup("rmi://localhost:9999/tinhtoan");
            int tinhTong = lookup.tinhTong(34, 44);
            System.out.println("nhan ve: " + tinhTong);
        } catch (NotBoundException ex) {
            Logger.getLogger(DemoRMIClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(DemoRMIClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(DemoRMIClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
