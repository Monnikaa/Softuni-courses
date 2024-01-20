package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int snowball = Integer.parseInt(sc.nextLine());
        double r = 0;
        int snowballSnowBiggest = 0;
        int snowballTimeBiggest = 0;
        int snowballQualityBiggest = 0;

        for (int i = 1; i <= snowball; i++) {
            int snowballSnow =Integer.parseInt(sc.nextLine());
            int snowballTime =Integer.parseInt(sc.nextLine());
            int snowballQuality =Integer.parseInt(sc.nextLine());
            //(snowballSnow / snowballTime) ^ snowballQuality
             double r2 = Math.pow(snowballSnow / snowballTime, snowballQuality);
             if (r < r2){
                 r = r2;
                 snowballSnowBiggest = snowballSnow;
                 snowballTimeBiggest = snowballTime;
                 snowballQualityBiggest = snowballQuality;
             }
        }
        System.out.printf("%d : %d = %.0f (%d)",snowballSnowBiggest, snowballTimeBiggest, r,snowballQualityBiggest );
    }
}
