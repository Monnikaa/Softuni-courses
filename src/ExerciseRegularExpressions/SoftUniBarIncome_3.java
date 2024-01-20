package ExerciseRegularExpressions;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pattern pat = Pattern.compile
                ("%(?<customerName>[A-Z][a-z]+)%[^\\|$%\\.]*<(?<product>\\w+)>[^\\|\\$%\\.]*\\|(?<count>[0-9]+)\\|[^\\|\\$%\\.]*?(?<price>[0-9]+\\.?[0-9]*)\\$");

        double sum = 0;

        String input = sc.nextLine();
        while (!input.equals("end of shift")){

            Matcher matcher = pat.matcher(input);
            if (matcher.find()){
                String ime = matcher.group("customerName");
                String produkt = matcher.group("product");
               int br = Integer.parseInt(matcher.group("count"));
               double cen = Double.parseDouble(matcher.group("price"));

               double obshto = br * cen;
               sum += obshto;
               System.out.printf("%s: %s - %.2f%n",ime, produkt, obshto);
            }
            input = sc.nextLine();
        }
        System.out.printf("Total income: %.2f",sum);
    }
}
