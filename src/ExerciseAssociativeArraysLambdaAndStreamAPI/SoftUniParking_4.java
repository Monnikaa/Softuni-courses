package ExerciseAssociativeArraysLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        LinkedHashMap<String, String> arrMap = new LinkedHashMap<>();
        for (int i = 1; i <= n ; i++) {
            String input = sc.nextLine();
            String command = input.split(" ")[0];
            String username = input.split(" ")[1];

            if (command.equals("register")){
                String licensePlateNumber = input.split(" ")[2];
                if(!arrMap.containsKey(username)){
                    arrMap.put(username, licensePlateNumber);
                    System.out.printf("%s registered %s successfully%n",username, licensePlateNumber);
                } else{
                    String hiscar = arrMap.get(username);
                    System.out.printf("ERROR: already registered with plate number %s%n",hiscar);
                }

            } else if (command.equals("unregister")){

                if (!arrMap.containsKey(username)){
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    System.out.printf("%s unregistered successfully%n", username);
                    arrMap.remove(username);
                }
            }
        }
         arrMap.forEach((key, value) -> System.out.printf("%s => %s%n", key, value));
    }
}
