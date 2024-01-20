package ExerciseBasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class VendingMachine_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0.0;
        double prise = 0;

        String input = sc.nextLine();
        while (!input.equals("Start")) {

            double money = Double.parseDouble(input);
            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1.0 || money == 2.0) {
                sum += money;
            } else {
                System.out.printf("Cannot accept %.2f%n", money);
            }
            input = sc.nextLine();
        }
        String product = sc.nextLine();
        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    if (sum >= 2){
                        System.out.println("Purchased Nuts");
                        sum -= 2;
                        product = sc.nextLine();
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (sum >= 0.7){
                        System.out.println("Purchased Water");
                        sum -= 0.7;
                        product = sc.nextLine();
                    }  else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (sum >= 1.5){
                        System.out.println("Purchased Crisps");
                        sum -= 1.5;
                        product = sc.nextLine();
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (sum >= 0.8){
                        System.out.println("Purchased Soda");
                        sum -= 0.8;
                        product = sc.nextLine();
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (sum >= 1.0){
                        System.out.println("Purchased Coke");
                        sum -= 1;
                        product = sc.nextLine();

                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    product = sc.nextLine();
            }
        }
        System.out.printf("Change: %.2f", sum);
    }
}