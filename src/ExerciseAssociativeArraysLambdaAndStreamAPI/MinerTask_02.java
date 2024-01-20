package ExerciseAssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class MinerTask_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input =sc.nextLine();

        Map<String, Integer> map = new LinkedHashMap<>();
        while (!input.equals("stop")){
            int quantity = Integer.parseInt(sc.nextLine());
            if(!map.containsKey(input)){
                map.put(input, quantity);
            } else {
                int value = map.get(input);
                map.put(input, value+ quantity);
            }
            input =sc.nextLine();
        }
        map.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
