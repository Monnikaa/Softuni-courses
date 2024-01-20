package drugi;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zadd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] text = sc.nextLine().split("");
        for (String entry : text) {

            Pattern pat = Pattern.compile("([A-Za-z]+(?<z>(\\\\@|\\\\$|\\\\#|\\\\^){6})[A-Za-z]+\\z[A-Za-z]+){20}");
            Matcher matcher = pat.matcher(entry);

            Pattern patt = Pattern.compile("(\\\\$|\\\\@|\\\\#|\\\\^){20}");
            Matcher matcher1 = patt.matcher(entry);

            if (matcher.find()) {

            } else if (matcher1.find()) {

            }
        }
    }
}
