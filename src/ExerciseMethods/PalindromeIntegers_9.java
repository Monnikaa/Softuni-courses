package ExerciseMethods;

import java.util.Scanner;

public class PalindromeIntegers_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            System.out.println(checkPalindrome(input));
            input = scanner.nextLine();
        }
    }


    public static boolean checkPalindrome (String text) {


        String reversedText = "";
        for (int index = text.length() - 1; index >= 0; index--) {
            reversedText += text.charAt(index);
        }

        return text.equals(reversedText);
    }

}
