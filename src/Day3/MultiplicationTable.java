package Day3;

public class MultiplicationTable {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++) {
            for (int j = 1; j <= i; j++) {
                int pro = i * j;
                System.out.printf("%d*%d=%d\t", i, j, pro);
            }
            System.out.println();
        }
    }
}
