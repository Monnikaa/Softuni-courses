package drugi;

import java.util.*;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        LinkedHashMap<String, List<String>> arrLike = new LinkedHashMap<>();
        LinkedHashMap<String, List<String>> arrDislike = new LinkedHashMap<>();
        while (!input.equals("Stop")) {

            String w1 = input.split("-")[0];
            String guest = input.split("-")[1];
            String meal = input.split("-")[2];

            if (w1.equals("Like")) {
                if (!arrLike.containsKey(guest)) {
                    arrLike.put(guest, new ArrayList<>());
                    arrLike.get(guest).add(meal);
                } else {
                    List<String> meals = arrLike.get(guest);
                    meals.add(meal);
                }
            } else if (w1.equals("Dislike")) {
                if (!arrLike.containsKey(guest)) {
                    System.out.printf("%s is not at the party.%n", guest);
                } else {
                    if (arrDislike.containsKey(guest)) {
                        arrDislike.put(guest, new ArrayList<>());
                        arrDislike.get(guest).add(meal);
                    }
                    if (arrLike.containsValue(meal)) {
                        arrLike.get(guest).remove(meal);
                        System.out.printf("%s doesn't like the %s%n", guest, meal);
                    } else {
                        System.out.printf("%s doesn't have the %s in his/her collection.%n", guest, meal);
                    }
                }
            }
            input = sc.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : arrLike.entrySet()) {
            String guest = entry.getKey();
            List<String> meals = entry.getValue();
            System.out.printf("%s: %s%n", guest, String.join(", ", meals));
            System.out.printf("Unliked meals:" + arrDislike.size());
        }
    }
}