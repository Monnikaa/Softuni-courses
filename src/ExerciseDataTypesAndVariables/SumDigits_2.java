package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class SumDigits_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        int sum = 0;
        while (num > 0){
            int ln = num % 10;
            sum += ln;
            num = num /10;
        }
        System.out.printf("%d",sum);
    }
}
