package ExerciseTextProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder text = new StringBuilder(input);

        for (int i = 0; i < text.length() -1; i++) {
            if(text.charAt(i) == text.charAt(i + 1)) {
                text.deleteCharAt(i + 1);
                i--;
            }
        }
        System.out.print(text);
    }
}
