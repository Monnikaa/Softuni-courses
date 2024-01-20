package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = Arrays.stream(sc.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < n.length - 1; i++) {
            int nC = n[i];
            boolean isBegger = true;

            for (int in = i + 1; in <= n.length -1; in++) {
                int nA = n[in];
                if (nC <= nA) {
                    isBegger = false;
                    break;
                }

            }
            if (isBegger) {
                System.out.print(nC + " ");
            }
        }
        System.out.print(n[n.length - 1]);
    }
}
