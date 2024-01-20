package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        BigInteger sum = BigInteger.valueOf(1);
        for (int i = 1; i <= num ; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        System.out.println(sum);
    }
}
