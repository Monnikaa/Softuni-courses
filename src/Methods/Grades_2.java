package Methods;

import java.util.Scanner;

public class Grades_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade = Double.parseDouble(sc.nextLine());

        getGrade(grade);

    }
    public static void getGrade(double grade){
        if (grade <= 2.99 && grade >= 2.00){
            System.out.println("Fail");
        } else if (grade >= 3.00 && grade <= 3.49){
            System.out.println("Poor");
        } else if (3.50 <= grade && grade <= 4.49){
        System.out.println("Good");
        } else if (4.50 <= grade && grade<= 5.49){
        System.out.println("Very good");
        } else if (5.50 <= grade && grade <= 6.00){
        System.out.println("Excellent");
        }
    }
}
