package ExerciseBasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class StrongNumber_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        int fNum = num;
        int sumFact = 0;
        while (num > 0) {
            int lastD = num % 10;

            int fact = 1;
            for (int i = 1; i <= lastD; i++){
                fact = fact * i;
            }
            sumFact += fact;

            num = num / 10;
        }
        if (fNum == sumFact){
            System.out.print("yes");
        } else{
            System.out.print("no");
        }
    }
}
