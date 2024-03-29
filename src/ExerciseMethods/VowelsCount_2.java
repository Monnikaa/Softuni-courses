package ExerciseMethods;

import java.util.Scanner;

public class VowelsCount_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine(); //"Desislava"


        printCountVowels(text);
    }

    //метод, който принтира брой на гласните букви в даден текст
    public static void printCountVowels (String text) {
        int count = 0; //брой на гласните букви
        //"desislava".toCharArray() -> ['d', 'e', 's', 'l', 'a', 'v', 'a']
        for (char letter : text.toCharArray()) {
            //малки гласни букви: a, e, i, o, u
            //главни гласни букви: A, E, I, O, U
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'
                    || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                count++;
            }
        }


        System.out.println(count);
    }
}
