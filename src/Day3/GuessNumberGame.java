package Day3;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int b = random.nextInt(100) + 1;
        Scanner src = new Scanner(System.in);
        System.out.print("从1-100猜一个数字:");
        while(true) {
            int num = src.nextInt();
            if (num != b)
                {if(num<b)
                    System.out.print("猜小啦!再猜一次：");
                 else
                    System.out.print("猜大啦!再猜一次：");}
            else
                break;
        }
        System.out.print("恭喜你猜对啦！");
    }
}
