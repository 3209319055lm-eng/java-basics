package Day2;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.print("你的成绩是:");
        float score=src.nextFloat();
        int a=(int)(score/10);
        switch(a){
            case 10:
            case 9:
                System.out.print("A");
                break;
            case 8:
                System.out.print("B");
                break;
            case 7:
                System.out.print("C");
                break;
            case 6:
                System.out.print("D");
                break;
            default:
                System.out.print("不及格");
        }

    }
}
