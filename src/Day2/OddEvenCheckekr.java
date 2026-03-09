package Day2;

import java.net.SocketOption;
import java.util.Scanner;

public class OddEvenCheckekr {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.print("输入一个整数：");
        int a=src.nextInt();
        if(a%2==0)
            System.out.println("这是偶数");
        else
            System.out.println("这是奇数");
    }
}
