package ExerciseArrays;
import java.util.Arrays;
import java.util.Scanner;

public class TheLift_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int people = Integer.parseInt(sc.nextLine());
        int[] n = Arrays.stream(sc.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean liftFull = true;

        for (int index = 0; index < n.length; index++) {
            int kolkoSvobodni = 4 - n[index];

            if (kolkoSvobodni > 0) {
                if (kolkoSvobodni > people) {
                    n[index] += people;
                    people = 0;
                    liftFull = false;

                } else {
                    n[index] = 4;
                    people -= kolkoSvobodni;
                }
            }
        }
        if (!liftFull){
            System.out.println("The lift has empty spots!");
        } else if (people > 0){
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
        }
        for(int v : n){
            System.out.print(v + " ");
        }
    }
}
