package ExerciseArrays;

import java.util.Scanner;

public class CommonElements_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] f = sc.nextLine().split(" ");
        String[] s = sc.nextLine().split(" ");
        for (String v : s){
            for (String d : f){
                if (v.equals(d)){
                    System.out.print(v + " ");
                }
            }

        }

    }
}
