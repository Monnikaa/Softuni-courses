package ExerciseArrays;

import java.util.Scanner;

public class ZigZagArrays_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = Integer.parseInt(sc.nextLine());
        int [] fArray = new int[rows];
        int [] sArray = new int[rows];

        for (int row = 1; row <= rows; row++) {
            String input = sc.nextLine();            // polochavam tekst ("2 5")
            String[] n = input.split(" ");    // splitvam go po interval "2" "5"
            int n1 = Integer.parseInt(n[0]);        // dai mi chisloto na n na [0] poziciq (2)
            int n2 = Integer.parseInt(n[1]);        // dai mi chisloto na n na [1] poziciq (5)
            //Integer.parseInt go pishem, zashtoto do togava sme imali tekst i go preobrazuvame v chisla
            if (row % 2 == 0){
                fArray[row -1] = n2;
                sArray[row -1] = n1;
            } else {
                fArray[row -1] =n1;
                sArray[row -1] =n2;;
            }
        }
        for(Integer v : fArray){
            System.out.print(v + " ");
        }
        System.out.println();
        for(Integer d : sArray) {
            System.out.print(d + " ");
        }
    }
}
