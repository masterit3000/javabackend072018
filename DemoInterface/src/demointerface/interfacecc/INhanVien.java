/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demointerface.interfacecc;

/**
 *
 * @author Admin
 */
public interface INhanVien {

    void nhap();

    default void hien() {

        System.out.println("noi dung mac dinh cua  ham hien");
    }

}
