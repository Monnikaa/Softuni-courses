package DataTypesAndVariables;

import java.util.Scanner;

public class ConvertMetersToKilometers_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());

        double k = m / 1000.0;

        System.out.printf("%.2f",k);
    }
}
