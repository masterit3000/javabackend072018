/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoex;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DemoEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            //hay co gang thuc hien doan code nay cho toi,
            //trong qua trinh thuc hien gap su co thi dung lai, nhay vao catch chay
            System.out.println("nhap 2 so a b");
            int a = new Scanner(System.in).nextInt();
            int b = new Scanner(System.in).nextInt();
            //vi du: ko dc chia cho 1
//            Exception suCo = new Exception("Su co chia cho 1");
            if (b == 1) {
                throw new ChiaChoMotException("b==1");//tu ban ra su co
                //neu chay vao lenh nay thi chuong trinh se nhay vao catch tuong ung chay, dung moi xu ly ben duoi
            }
            int c = a / b;
            c = a / (b + a - ++b / (a + b++ / b));
            System.out.println("c= " + c);
//        } catch (Exception e) {//gap su co thi vào day chay
        } catch (ArithmeticException e) {//gap su co ve toan hoc 4thi vào day chay
            //moi khi gap su co, thi he thong se sinh ra 1 obj dai dien cho su co do ( exception) sau do se goi catch va truyen vao
            System.out.println("gap su co ve toan học, kiem tra lai du lieu dau vao");
            System.out.println(e.getMessage());
        } catch (InputMismatchException einp) {//gapo su co ve nhap du lieu ko dung kieu
            System.out.println("Nhap du lieu bi sai");
        } catch (ChiaChoMotException e) {//gapo su co ve nhap du lieu ko dung kieu
            System.out.println("Su cho chia cho mot:" + e.getMessage());
        } catch (Exception e) {
            System.out.println("gap su co j do:" + e.getMessage());
        }
    }

}
