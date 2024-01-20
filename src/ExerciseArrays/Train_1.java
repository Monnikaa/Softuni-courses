package ExerciseArrays;

import java.util.Scanner;

public class Train_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] wagon = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++){
            wagon [i] = Integer.parseInt(sc.nextLine());
        }
        for (Integer v : wagon){
            System.out.print(v + " ");
            sum += v;
        }
        System.out.println();
        System.out.println(sum);
    }
}
