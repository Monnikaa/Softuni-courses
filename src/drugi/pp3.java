package drugi;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class pp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        LinkedHashMap<String, Double> arr = new LinkedHashMap<>();
        LinkedHashMap<String, Double> clienti = new LinkedHashMap<>();
        double sum = 0;

        while (!text.equals("End")){
           String w1 = text.split(" ")[0];

           if(w1.equals("Deliver")){
               String w2 = text.split(" ")[1];
               double w3 = Double.parseDouble(text.split(" ")[2]);
               if(!arr.containsKey(w2)){
                   arr.put(w2, w3);
               } else {
                   double curMoney = arr.get(w2);
                   arr.put(w2, curMoney + w3);
               }

           } else if(w1.equals("Return")){
               String w2 = text.split(" ")[1];
               double w3 = Double.parseDouble(text.split(" ")[2]);
               if(arr.containsKey(w2)){
                   double curMoney = arr.get(w2);
                   if(w3 <= curMoney) {
                       arr.put(w2, curMoney - w3);
                       if (arr.get(w2) == 0) {
                           arr.remove(w2);
                       }
                   }
               }
           } else if(w1.equals("Sell")){
               String w2 = text.split(" ")[1];
               double w3 = Double.parseDouble(text.split(" ")[2]);
               if(!clienti.containsKey(w2)){
                   clienti.put(w2, w3);
               } else{
                   double cur = clienti.get(w2);
                   clienti.put(w2, cur + w3);
               }
               sum += w3;
           }
            text = sc.nextLine();
        }
        for(Map.Entry<String, Double> entry :clienti.entrySet()) {
            String name = entry.getKey();
            System.out.printf("%s: %.2f%n", name, entry.getValue());
        }
        System.out.println("-----------");
        arr.forEach((key, value) -> System.out.printf("%s: %.2f%n",key, value));
        System.out.println("-----------");
        System.out.printf("Total Income: %.2f", sum);
    }
}
