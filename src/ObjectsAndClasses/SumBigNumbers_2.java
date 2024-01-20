package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger fNumber = new BigInteger(sc.nextLine());
        BigInteger sNumber = new BigInteger(sc.nextLine());
        BigInteger sum = fNumber.add(sNumber);
        System.out.println(sum);
    }
}
