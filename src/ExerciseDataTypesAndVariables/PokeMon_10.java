package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());
        int n2 = n;
        int puti = 0;
        while (n >= m){
            n = n - m;
            puti++;
            if (n2 / 2 == n){
                if (y != 0) {
                    n = n / y;
                }
            }
        }
        System.out.println(n);
        System.out.println(puti);
    }
}
