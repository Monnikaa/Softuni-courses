package Methods;

import java.util.Scanner;

public class SignOfInteger_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        theNum(n);
    }
    public static void theNum(int nn) {
        if (nn > 0){
            System.out.printf("The number %d is positive.", nn);
        } else if (nn < 0){
            System.out.printf("The number %d is negative.", nn);
        }else if (nn == 0){
            System.out.println("The number 0 is zero.");
        }
    }
}
