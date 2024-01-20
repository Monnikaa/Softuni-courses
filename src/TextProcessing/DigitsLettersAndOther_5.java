package TextProcessing;

import java.util.Scanner;

public class DigitsLettersAndOther_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        StringBuilder digitS = new StringBuilder();
        StringBuilder letterS = new StringBuilder();
        StringBuilder other = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            if(Character.isDigit(symbol)){
                digitS.append(symbol);

            } else if (Character.isLetter(symbol)){
                letterS.append(symbol);

            } else {
                other.append(symbol);

            }
        }
        System.out.println(digitS);
        System.out.println(letterS);
        System.out.println(other);
    }
}
