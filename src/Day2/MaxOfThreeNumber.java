package Day2;

import java.util.Scanner;

public class MaxOfThreeNumber {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.print("依次输入三个数:");
        float a=src.nextFloat();
        float b=src.nextFloat();
        float c=src.nextFloat();
        if(a<b)
        {
            float t;
            t=a;
            a=b;
            b=t;
        }
        if(a<c)
        {
            float t;
            t=a;
            a=c;
            c=t;
        }
        System.out.printf("最大值使:%f",a);
    }
}
