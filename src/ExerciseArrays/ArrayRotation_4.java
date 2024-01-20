package ExerciseArrays;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = Integer.parseInt(sc.nextLine());
        //vurtene na chisla
        for (int row = 1; row <= rows; row++) {

            // vzimame 1 element
            int fnum = n[0];

            // premestvame vsichki s edio nalqvo
            // bez posledniq element
            for (int index = 0; index < n.length-1; index++) {
                n[index] = n[index+1];
            }

            // premestvame purviq otzad
            n[n.length-1]= fnum;

        }
        for(int v : n){
            System.out.print(v + " ");
        }
    }
}
