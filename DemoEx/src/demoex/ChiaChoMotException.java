/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoex;

/**
 *
 * @author Admin
 */
public class ChiaChoMotException extends Exception {

    public ChiaChoMotException(String b1) {
        super(b1);
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "Chia cho mot"; //To change body of generated methods, choose Tools | Templates.
    }

}
