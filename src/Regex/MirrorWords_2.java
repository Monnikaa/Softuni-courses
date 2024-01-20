package Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Pattern pat = Pattern.compile("(@|#)(?<first>[A-Za-z]{3,})\\1\\1(?<second>[A-Za-z]{3,})\\1");
        Matcher matcher = pat.matcher(text);
        int row = 0;
        List<String> arr = new ArrayList<>();
        boolean isValid = false;
        boolean ogled = false;

        while (matcher.find()){
            isValid = true;
            row ++;
            String fw = matcher.group("first");
            String sw = matcher.group("second");
            if(fw.equals(new StringBuilder(sw).reverse().toString())){
                ogled = true;
                arr.add(fw + " <=> " + sw);
            }
        }
        if (isValid) {
            System.out.printf("%d word pairs found!%n", row);
        } else {
            System.out.println("No word pairs found!");
        }
        if(ogled){
            System.out.println("The mirror words are:");
            System.out.print(String.join(", ", arr));
        } else {
            System.out.println("No mirror words!");
        }
    }
}
