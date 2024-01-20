package ExerciseTextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidUsernames_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Има дължина между 3 и 16 знака.
        //· Съдържа само букви, цифри, тирета и долна черта

        String[] names = sc.nextLine().split(", ");


        boolean valied = true;

        for (String word: names) {
            valied =true;
            if (word.length() < 3 || word.length() > 16){
                valied = false;
            }
            for (int i = 0; i < word.length(); i++) {
                char symbol = word.charAt(i);

                if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                    valied = false;
                }
            }
            if (valied){
                System.out.println(word);
            }

        }
    }
}
