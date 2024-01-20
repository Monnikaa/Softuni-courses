package ExerciseBasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class PrintAndSum04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fn = Integer.parseInt(sc.nextLine());
        int ln = Integer.parseInt(sc.nextLine());
        int sum = 0;

        for (int i = fn; i <= ln; i++){
            System.out.print(i +" ");
            sum += i;
        }
        System.out.println();
        System.out.println("Sum: "+ sum);
    }
}
