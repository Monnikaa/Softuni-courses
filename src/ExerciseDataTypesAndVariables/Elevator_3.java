package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class Elevator_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = Integer.parseInt(sc.nextLine());
        int howCan = Integer.parseInt(sc.nextLine());
        double result = 0;

        if (people < howCan){
            result = 1;
        } else if (people % howCan == 0){
            result = people / howCan;
        } else {
            result = (people / howCan) + 1;
        }
        System.out.printf("%.0f", result);
    }
}
