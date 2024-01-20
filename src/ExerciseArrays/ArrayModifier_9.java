package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String text = sc.nextLine();

        while (!text.equals("end")) {
            String n1 = text.split(" ")[0];

            if (n1.equals("swap")) {
                int n2 = Integer.parseInt(text.split(" ")[1]);
                int n3 = Integer.parseInt(text.split(" ")[2]);
                int n02 = num[n2];
                num[n2] = num[n3];
                num[n3] = n02;
            } else if (n1.equals("multiply")) {
                int n2 = Integer.parseInt(text.split(" ")[1]);
                int n3 = Integer.parseInt(text.split(" ")[2]);
                if (n2 < n3) {
                    // n2 = 1 n3 = 2
                    int mul = num[n2] * num[n3];
                    num[n2] = mul;
                } else {
                    //n3 = 1 n2 = 2
                    int mul = num[n2] * num[n3];
                    num[n2] = mul;
                }

            } else if (n1.equals("decrease")) {
                for (int index = 0; index < num.length; index++){
                    num[index] -= 1;
                }
            }
            text = sc.nextLine();
        }
        System.out.println(Arrays.toString(num)           //"[86, 7382, 2369942, -124, 41, 89, -3]"
                .replace("[", "") //"86, 7382, 2369942, -124, 41, 89, -3]"
                .replace("]", "") //"86, 7382, 2369942, -124, 41, 89, -3"
        );

    }
}
