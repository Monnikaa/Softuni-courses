package drugi;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int reg = 0;

        for (int i = 0; i < n; i++) {
            String text = sc.nextLine();
            Pattern pat = Pattern.compile("U\\$(?<username>[A-Z][a-z]{2,})U\\$P@\\$(?<password>[A-Za-z]{5,}\\d{1,})P@\\$");
            Matcher matcher = pat.matcher(text);


            if (matcher.find()) {
                reg++;
                String username = matcher.group("username");
                String password = matcher.group("password");
                System.out.println("Registration was successful");
                System.out.printf("Username: %s, Password: %s%n",username, password);
            } else {
                System.out.println("Invalid username or password");
            }
        }
        System.out.printf("Successful registrations: %d", reg);
    }
}
