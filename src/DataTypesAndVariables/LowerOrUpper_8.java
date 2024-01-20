package DataTypesAndVariables;

import java.util.Scanner;

public class LowerOrUpper_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char inputChar = sc.next().charAt(0);

        if (Character.isUpperCase(inputChar)) {
            System.out.println("upper-case");
        } else if (Character.isLowerCase(inputChar)) {
            System.out.println("lower-case");
        } else {
            System.out.println(inputChar + " is not a letter.");
        }

    }
}
