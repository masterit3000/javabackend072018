/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democlassvodanh.event;

/**
 *
 * @author Admin
 */
public class NutBam {

    private IXuLyAnNut iXuLyAnNut;

    public IXuLyAnNut getXuLyAnNut() {
        return iXuLyAnNut;
    }

    public void setXuLyAnNut(IXuLyAnNut iXuLyAnNut) {
        this.iXuLyAnNut = iXuLyAnNut;
    }

    public void anNut() {
        //dc frame goi khi ma ntu bi an, va se phai chay 1 doan code nao do, do LTV sau nay truyen vao
        iXuLyAnNut.nutBiAn();
    }

}
