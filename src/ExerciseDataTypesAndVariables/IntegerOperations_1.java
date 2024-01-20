package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class IntegerOperations_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        int n3 = Integer.parseInt(sc.nextLine());
        int n4 = Integer.parseInt(sc.nextLine());

        double sum = (n1 + n2) / n3;
        double result = sum * n4;

        System.out.printf("%.0f", result);

    }
}
