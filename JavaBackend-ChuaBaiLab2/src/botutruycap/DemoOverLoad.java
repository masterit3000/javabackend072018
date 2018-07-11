/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botutruycap;

/**
 *
 * @author Admin
 */
public class DemoOverLoad {

    public int tinhTong(int a, int b) {

        return a + b;
    }

    public int tinhTong(float a, float b) {

        return (int) (a + b);
    }

    public int tinhTong(float b, int a) {

        return (int) (a + b);
    }



    public int tinhTong(int... a) {//ham co tham so truyen vao kha bien
        //luc nay trong noi dung ham nay a coi nhu 1 mang
        int tong = 0;
        for (int i = 0; i < a.length; i++) {
            tong += a[i];//tong = tong +a;
        }
        return tong;
    }

    public static void main(String[] args) {
        DemoOverLoad demoOverLoad = new DemoOverLoad();

        demoOverLoad.tinhTong(11, 0);
        demoOverLoad.tinhTong(11, 0, 4);
        demoOverLoad.tinhTong(11f, 4.5f);
        demoOverLoad.tinhTong(4.5f, 11f);
        demoOverLoad.tinhTong(11, 0, 4, 5);
        demoOverLoad.tinhTong(11, 0, 5, 4, 5);
        demoOverLoad.tinhTong(11, 0, 6, 5, 4, 5);
        System.out.printf("Xin chao bạn: %s, nam nay ban %d tuoi", "Nguyen Van a",34);
    }
}
