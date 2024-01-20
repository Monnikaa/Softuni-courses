package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


    }
}
