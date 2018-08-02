/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoex.demo;

/**
 *
 * @author Admin lay bai cu ra tap them exception vao
 */
public class TuoiException extends Exception {

    @Override
    public String getMessage() {
        return "Tuoi phai lon hon 0 va nho hon 100. " + super.getMessage(); //To change body of generated methods, choose Tools | Templates.
    }

}
