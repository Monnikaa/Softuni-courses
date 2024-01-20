package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class SpiceMustFlow_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iztochnik = Integer.parseInt(sc.nextLine());

        int days = 0;
        int total = 0;
        while (iztochnik >= 100){
            days ++;
            total += iztochnik - 26;
            iztochnik -= 10;

        }
        total -= 26;

        if (total < 0){
            total = 0;
        }

        System.out.println(days);
        System.out.println(total);
    }
}
