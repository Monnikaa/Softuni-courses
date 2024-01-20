package BasicSyntaxConditionalStatementsandLoop;

import java.util.Scanner;

public class MultiplicationTable10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        int times = 1;

        while (times <= 10){
            System.out.printf("%d X %d = %d%n", num, times,num * times);
            times++ ;
        }
    }
}
