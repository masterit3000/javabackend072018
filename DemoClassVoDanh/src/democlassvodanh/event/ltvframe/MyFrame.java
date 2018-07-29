/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democlassvodanh.event.ltvframe;

import democlassvodanh.event.ITypingText;
import democlassvodanh.event.IXuLyAnNut;
import democlassvodanh.event.NutBam;
import democlassvodanh.event.TextBox;

/**
 *
 * @author Admin
 */
public class MyFrame {
    //su dung nut bam

    NutBam nutBam = new NutBam();
    TextBox textBox = new TextBox();

    //gia su co 1 ham dai dien cho viec nguoi dung an nut
    public void nguoiDungAnNut() {
        //moi khi ng dung an nut ham nay dc goi, ham nay dc code truc
        nutBam.anNut();
    }
    
    public void nguoidunggoPhim() {
        
        textBox.goPhim("dang go linh tinh");
    }

    //yeu cau an nut thi hen ta ten chuong trinh
    private String tenChuongTrinh = " quan ly nhan vien";
    
    public MyFrame() {
        
        nutBam.setXuLyAnNut(() -> {
            System.out.println("DAY LA PHAM MEM: " + tenChuongTrinh);
        });
        nutBam.setXuLyAnNut(System.out::println);

//        nutBam.setXuLyAnNut(new IXuLyAnNut() {
//            @Override
//            public void nutBiAn() {
//                System.out.println("DAY LA PHAM MEM: " + tenChuongTrinh);
//            }
//        });
//////////////////////////////////////////////////////////////////
//        textBox.setTypingText((s) -> System.out.println("bang dang go:..." + s));
        textBox.setTypingText(MyFrame::inNoiDungAnPhim);
        textBox.setTypingText((s) -> MyFrame.inNoiDungAnPhim(s));
        textBox.setTypingText(new ITypingText() {
            @Override
            public void typing(String s) {
                MyFrame.inNoiDungAnPhim(s);
            }
        });
    }
    
    public static void inNoiDungAnPhim(String noiDung) {
        
        System.out.println("Nguoi dung dang an nut: " + noiDung);
    }
    
    public static void main(String[] args) {
        
        MyFrame myFrame = new MyFrame();
        myFrame.nguoiDungAnNut();
        myFrame.nguoiDungAnNut();
        
        myFrame.nguoidunggoPhim();
        myFrame.nguoidunggoPhim();
        myFrame.nguoidunggoPhim();
    }

//    class XuLyAnNut implements IXuLyAnNut {
//
//        @Override
//        public void nutBiAn() {
//            System.out.println("Day la phan mem: " + tenChuongTrinh);
//        }
//
//    }
}
