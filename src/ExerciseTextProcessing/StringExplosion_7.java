package ExerciseTextProcessing;

import java.util.Scanner;

public class StringExplosion_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //"abv>1>1>2>2asdasd"
        StringBuilder text = new StringBuilder(input);

        int totalStrength = 0; //сила
        for (int i = 0; i < text.length() ; i++) {
            char currentSymbol = text.charAt(i);
            if (currentSymbol == '>') {

                int attackStrength = Integer.parseInt(text.charAt(i + 1) + "");
                totalStrength += attackStrength;
            } else if (currentSymbol != '>' && totalStrength > 0) {
                //премахване
                text.deleteCharAt(i);
                totalStrength--;
                i--;

            }
        }
        System.out.println(text);
    }
}
