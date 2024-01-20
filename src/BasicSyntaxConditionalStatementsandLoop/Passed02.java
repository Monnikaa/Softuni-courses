package BasicSyntaxConditionalStatementsandLoop;

import java.util.Scanner;

public class Passed02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double grade = Double.parseDouble(sc.nextLine());

        if (grade >= 3){
            System.out.print("Passed!");
        } else {
            System.out.print("Failed!");
        }
    }
}
