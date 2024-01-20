package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Pattern pat = Pattern.compile("(?<day>\\d{2})([-.\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b");
        Matcher match = pat.matcher(input);

        while (match.find()){
            String Day = match.group("day");
            String Month = match.group("month");
            String Year = match.group("year");
            System.out.printf("Day: %s, Month: %s, Year: %s%n", Day, Month, Year);
        }
    }
}
