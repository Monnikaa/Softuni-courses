package ExerciseBasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class TriangleOfNumbers_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int row = 1; row <= n; row++){
            for (int num = 1; num <= row; num++){
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
