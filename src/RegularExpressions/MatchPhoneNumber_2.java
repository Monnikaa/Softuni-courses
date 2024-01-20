package RegularExpressions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String  telNumbers = sc.nextLine();
        Pattern pat = Pattern.compile("\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b");
        Matcher match = pat.matcher(telNumbers);

        List<String> numlist = new ArrayList<>();
        while (match.find()){
           numlist.add(match.group());
        }
        System.out.print(String.join(", ", numlist));
    }
}
