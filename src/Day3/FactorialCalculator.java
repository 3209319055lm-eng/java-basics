package Day3;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.print("输入一个整数:");
        int a=src.nextInt();
        BigInteger pro=BigInteger.ONE;
        for(int b=1;b<=a;b++)
        {
            pro=pro.multiply(BigInteger.valueOf(b));
        }
        System.out.printf("该数阶乘为：%d",pro);
    }
}
// BigInteger 创建
// 1. 超大数：new BigInteger("字符串")，数字字符串写多长存多长    BigInteger num1 = new BigInteger("12345678901234567890");
// 2. 普通数转：BigInteger.valueOf(数字)          BigInteger num2 = BigInteger.valueOf(987654321);
// 运算（不能用 + - * /）  a.add(b);+     a.subtract(b);-   a.multiply(b); *     .divide(b);/