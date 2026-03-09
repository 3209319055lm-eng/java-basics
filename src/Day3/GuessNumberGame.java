package Day3;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Random random=new Random();
        int b=random.nextInt(100)+1;
        Scanner src=new Scanner(System.in);
        System.out.print("从1-100猜一个数字:");
        int num=src.nextInt();
        int count=0;
        for(int i=1;i<=num;i++)
            count++;
        System.out.printf("猜到啦,是%d!",count);

    }
}
