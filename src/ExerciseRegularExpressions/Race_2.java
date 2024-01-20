package ExerciseRegularExpressions;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] uchastnici = sc.nextLine().split(", ");
//George, Peter, Bill, Tom
        String input = sc.nextLine();

        while (!input.equals("end of race")){
//"G!32e%o7r#32g$235@!2e"

            Pattern letterspattern = Pattern.compile("[A-Za-z]");
            Matcher matcherLetters = letterspattern.matcher(input);
            while (matcherLetters.find()){

            }

            input = sc.nextLine();
        }
    }
}
