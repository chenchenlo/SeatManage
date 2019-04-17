package chenhonglin.seatmanage.config;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int money=in.nextInt();
        huan(money);
    }

    public static void huan(int money){
        int m64 = (1024-money)/64;
        int m32 = ((1024-money)%64)/16;
        int m4 = (((1024-money)%64)%16)/4;
        int m1 = ((((1024-money)%64)%16)%4);
        System.out.println(m64+m32+m4+m1);
    }
}
