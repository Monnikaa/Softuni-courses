package ExerciseRegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        List<String> furniture = new ArrayList<>();
        double sum = 0;

        while (!input.equals("Purchase")) {

            Pattern pat = Pattern.compile(">>(?<furnitureName>[A-Za-z]+)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)");
            Matcher matcher = pat.matcher(input);
            if (matcher.find()) {
                String furName = matcher.group("furnitureName");
                furniture.add(furName);
                double pri = Double.parseDouble(matcher.group("price"));
                int qua = Integer.parseInt(matcher.group("quantity"));
                sum += pri * qua;
            }
            input = sc.nextLine();
        }
        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", sum);
    }
}
