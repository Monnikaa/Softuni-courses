package TextProcessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] word = sc.nextLine().split(" ");

        for (int i = 0; i < word.length ; i++) {
            String currNum = word[i];
            int length = currNum.length();
            for (int j = 0; j < length; j++) {
                System.out.print(String.join("",currNum));
            }
        }
    }
}
