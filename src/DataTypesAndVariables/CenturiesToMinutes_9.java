package DataTypesAndVariables;

import java.util.Scanner;

public class CenturiesToMinutes_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cen = Integer.parseInt(sc.nextLine());

        double years = cen * 100;
        double days = years * 365.2422;
        double hours = days * 24;
        double min = hours * 60;
        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes", cen, years, days, hours, min);

    }
}
