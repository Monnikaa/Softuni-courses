package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int length = 1;
        int maxLength = 0;
        int name = 0;
        int theOne = 0;

        for (int index = 1; index < numbers.length; index++) {
            if (numbers[index] == numbers[index - 1]) {
                length++;
                name = numbers[index];
            } else {
                length = 1;

            }
            if (length > maxLength) {
                maxLength = length;
                theOne = name;
            }
        }
        for (int i = 1; i <= maxLength; i++) {
            System.out.print(theOne + " ");
        }
    }
}
