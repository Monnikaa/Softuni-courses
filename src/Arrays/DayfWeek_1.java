package Arrays;

import java.util.Scanner;

public class DayfWeek_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String[] day = {
               "Monday",
               "Tuesday",
               "Wednesday",
               "Thursday",
               "Friday",
               "Saturday",
               "Sunday",
        };
       int n = Integer.parseInt(sc.nextLine());

       if (n > 0 && n < 8){
           System.out.println(day[n-1]);
       } else {
           System.out.println("Invalid day!");
       }
    }
}
