package ExerciseTextProcessing;

import java.util.Scanner;

public class CharacterMultiplier_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String text1 = input.split(" ")[0];
        String text2 = input.split(" ")[1];

        sum(text1, text2);
    }
    public static void sum( String text1, String text2){
        int sum = 0;
        int minLength = Math.min(text1.length(), text2.length());
        int maxLength = Math.max(text1.length(), text2.length());

        if (text1.length() == text2.length()){

            for (int i = 0; i < text1.length(); i++) {
                sum += text1.charAt(i) * text2.charAt(i);
            }
            System.out.println(sum);

        } else {
            if (text1.length() > text2.length()){
                for (int i = 0; i < text2.length(); i++) {
                    sum += text1.charAt(i) * text2.charAt(i);
                }
                for (int i = text2.length(); i < text1.length() ; i++) {
                    sum += text1.charAt(i);
                }
                System.out.println(sum);

            } else {
                for (int i = 0; i < text1.length(); i++) {
                    sum += text1.charAt(i) * text2.charAt(i);
                }
                for (int i = text1.length(); i < text2.length() ; i++) {
                    sum += text2.charAt(i);
                }
                System.out.println(sum);
            }
        }

    }

}
