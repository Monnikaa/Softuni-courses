package ExerciseAssociativeArraysLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> material = new LinkedHashMap<>();
        material.put("shards", 0);
        material.put("fragments", 0);
        material.put("motes", 0);

        LinkedHashMap<String, Integer> jung = new LinkedHashMap<>();
        boolean win = false;

        while (!win) {
            String input = sc.nextLine();
            String[] inputData = input.split("\\s+");

            for (int i = 0; i <= inputData.length - 1; i += 2) {
                int quantity = Integer.parseInt(inputData[i]);
                String name = inputData[i + 1].toLowerCase();

                if (material.containsKey(name)) {
                    int value = material.get(name);
                    material.put(name, value + quantity);

                } else if (!jung.containsKey(name)) {
                    jung.put(name, quantity);

                } else {
                    int value = jung.get(name);
                    jung.put(name, value + quantity);
                }

                if (material.get("shards") >= 250){
                    System.out.println("Shadowmourne obtained!");
                    material.put("shards", material.get("shards")- 250);
                    win = true;
                    break;

                } else if (material.get("fragments") >= 250){
                    System.out.println("Valanyr obtained!");
                    material.put("fragments", material.get("fragments")- 250);
                    win = true;
                    break;

                }else if (material.get("motes") >= 250){
                    System.out.println("Dragonwrath obtained!");
                    material.put("motes", material.get("motes")- 250);
                    win = true;
                    break;
                }
                if (win) {
                    break;
                }
            }
        }
        material.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));
        jung.forEach((key, value)-> System.out.printf("%s: %d%n", key, value));
    }
}


