package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class SumOfChars_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        double sum = 0;
        for (int i = 1; i <= n; i++){
            char ch = sc.nextLine().charAt(0);
            sum += (int)ch;
        }
            System.out.printf("The sum equals: %.0f", sum);
    }
}
