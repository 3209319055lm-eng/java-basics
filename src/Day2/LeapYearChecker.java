package Day2;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int year;
        System.out.print("输入年份:");
        year=src.nextInt();
        if(year%400==0||(year%4==0&&year%100!=0))
            System.out.println("这是 闰年");
        else
            System.out.println("这是 平年");
    }
}
