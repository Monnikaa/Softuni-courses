package DataTypesAndVariables;

import java.util.Scanner;

public class TownInfo_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tName = sc.nextLine();
        int population = Integer.parseInt(sc.nextLine());
        int area = Integer.parseInt(sc.nextLine());
        System.out.printf("Town %s has population of %d and area %d square km.", tName,population,area);
    }
}
