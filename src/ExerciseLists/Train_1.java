package ExerciseLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> wagon = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxNumWagon = Integer.parseInt(sc.nextLine());

        String text = sc.nextLine();
        while (!text.equals("end")){
            String t1 = text.split(" ")[0];
            if (t1.equals("Add")){
                int passengers = Integer.parseInt(text.split(" ")[1]);
                wagon.add(passengers);
            } else {
                int passengersToAdd = Integer.parseInt(text.split(" ")[0]);
                for (int i = 0; i < wagon.size(); i++) {
                    int currentWagon = wagon.get(i);
                    if(currentWagon + passengersToAdd <= maxNumWagon) {
                        wagon.set(i, currentWagon + passengersToAdd);
                        break;
                    }
                }
            }
            text = sc.nextLine();
        }
        for (int v : wagon){
            System.out.print(v + " ");
        }

    }
}
