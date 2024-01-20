package DataTypesAndVariables;

import java.util.Scanner;

public class PoundsToDollars_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1 British Pound = 1.36 Dollars
        double bp = Double.parseDouble(sc.nextLine());
        double d = bp * 1.36;
        System.out.printf("%.3f", d);

    }
}
