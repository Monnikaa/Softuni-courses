package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = Arrays.stream(sc.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int magicSum = Integer.parseInt(sc.nextLine());
        for (int index = 0; index < num.length; index++) {
            if (num[index] < magicSum){
                for (int i = index + 1; i < num.length ; i++) {
                    if (num[i] + num[index] == magicSum){
                        System.out.println(num[index] + " " + num[i]);
                    }
                }
            }
        }
    }
}
