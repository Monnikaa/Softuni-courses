package TextProcessing;

import java.util.Scanner;

public class ReverseStrings_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        while (!word.equals("end")){
            String newWord = "";
            for (int i = word.length()-1; i >= 0; i--){
                char ch = word.charAt(i);
                newWord += ch;
            }
            System.out.printf("%s = %s%n", word, newWord);
            word = sc.nextLine();
        }
    }
}
