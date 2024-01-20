package ExerciseBasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class Orders_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countOfOrders = Integer.parseInt(sc.nextLine());

        double total = 0;

        for (int i = 1; i <= countOfOrders; i++){
            double pricePerCapsule = Double.parseDouble(sc.nextLine());
            int days = Integer.parseInt(sc.nextLine());
            int capsulesCount= Integer.parseInt(sc.nextLine());
            double result = ((pricePerCapsule * days) * capsulesCount);
            total += result;
            System.out.printf("The price for the coffee is: $%.2f%n", result);

        }
        System.out.printf("Total: $%.2f", total);
    }
}
