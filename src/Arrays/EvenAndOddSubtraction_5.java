package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int oddsum = 0;
        int evensum = 0;

        for (int m : n){
            if (m % 2 == 0){
                evensum += m;
            } else {
                oddsum += m;
            }
        }

            int result = evensum - oddsum;
            System.out.print(result);

    }
}
