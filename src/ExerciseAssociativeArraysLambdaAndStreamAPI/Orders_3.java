package ExerciseAssociativeArraysLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        LinkedHashMap<String,Integer> arrQuantity = new LinkedHashMap<>();
        LinkedHashMap<String, Double> arrPrice = new LinkedHashMap<>();

        while (!input.equals("buy")){
            String product = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);

            if (!arrQuantity.containsKey(product)){
                arrQuantity.put(product, quantity);
            } else {
                int currentQuantity = arrQuantity.get(product);
                arrQuantity.put(product, currentQuantity + quantity);
            }
                arrPrice.put(product,price);

            input = sc.nextLine();
        }
        for (Map.Entry<String,Integer> entry : arrQuantity.entrySet()){
            //pravq obikolka na vsqki element v mapa(vseqko entry
            // element = entry = key i value
            String productName = entry.getKey();
            //entry get.key = dai mi key na elementa v momenta. Key e ptodukta
            double finalSum = arrPrice.get(productName) * arrQuantity.get(productName);
            // izchislqvame cenata => cenata * kolichestvoto
            System.out.printf("%s -> %.2f%n",productName, finalSum);
        }
    }
}
