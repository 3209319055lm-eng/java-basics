package Day1;
import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args){
        Scanner src=new Scanner(System.in);
        System.out.print("a=");
        int a=src.nextInt();
        System.out.print("b=");
        int b=src.nextInt();
        int c;
        c=a;
        a=b;
        b=c;
        System.out.printf("a=%d b=%d",a,b);}
}
