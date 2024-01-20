package BasicSyntaxConditionalStatementsandLoop;

import java.util.Scanner;

public class TheatrePromotion07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String typeDay = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());

        if (typeDay.equals("Weekday")){
            if ((0 <= age) && (age <= 18)) {
                System.out.print("12$");
            } else if ((age > 18) && (age <= 64)) {
                System.out.print("18$");
            } else if ((age > 64) && (age <= 122)) {
                System.out.print("12$");
            } else {
                System.out.print("Error!");
            }
        } if (typeDay.equals("Weekend")){
            if ((0 <= age) && (age <= 18)) {
                System.out.print("15$");
            } else if (age > 18 && age <= 64 ){
                System.out.print("20$");
            } else if (age > 64 && age <= 122){
                System.out.print("15$");
            }  else {
                System.out.print("Error!");
            }
        } if (typeDay.equals("Holiday")){
            if ((0 <= age) && (age <= 18)) {
                System.out.print("5$");
            } else if (age > 18 && age <= 64 ) {
                System.out.print("12$");
            } else if (age > 64 && age <= 122) {
                System.out.print("10$");
            }else {
                System.out.print("Error!");
            }
        }
    }
}
