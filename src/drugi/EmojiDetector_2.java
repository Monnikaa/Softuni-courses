package drugi;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Pattern pat = Pattern.compile("(::|\\*\\*)([A-Z][a-z]{2,})\\1");
        Matcher matcher = pat.matcher(text);

        Pattern patCifri = Pattern.compile("\\d");
        Matcher matcher1 = patCifri.matcher(text);

        int sum = 1;
        while (matcher1.find()){
         //   sum *= matcher1.group();
        }

    }
}
