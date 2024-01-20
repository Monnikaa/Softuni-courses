package ExerciseTextProcessing;

import java.util.Scanner;

public class CaesarCipher_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
       // String[] text = input.split(" ");

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt((int) i);
            int newCh = ch + 3;
            System.out.print((char) newCh);
        }
    }
}
