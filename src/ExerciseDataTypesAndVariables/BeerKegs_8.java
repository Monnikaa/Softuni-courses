package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = Integer.parseInt(sc.nextLine());

        double maxv = 0;
        String maxM = "";
        for (int i = 1; i <= row; i++){
            String model = sc.nextLine();
            double r = Double.parseDouble(sc.nextLine());
            int h = Integer.parseInt(sc.nextLine());

            double volume = Math.PI * Math.pow(r, 2) * h;

            if (volume > maxv){
                maxv = volume;
                maxM = model;
            }

        }
        System.out.println(maxM);
    }
}
