package Methods;

import java.util.Scanner;

public class Orders_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String product = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());

        if(product.equals("coffee")){
            coffee(quantity);
        } else if(product.equals("water")){
            water(quantity);
        }  else if(product.equals("coke")){
            coke(quantity);
        } else if(product.equals("snacks")){
            snacks(quantity);
        }

    }
    public static void coffee(int quantity){
        double result = quantity * 1.50;
        System.out.printf("%.2f", result);
    }
    public static void water(int quantity){
        double result = quantity * 1.00;
        System.out.printf("%.2f", result);
    }
    public static void coke(int quantity){
        double result = quantity * 1.40;
        System.out.printf("%.2f", result);
    }
    public static void snacks(int quantity){
        double result = quantity * 2.00;
        System.out.printf("%.2f", result);
    }
}
