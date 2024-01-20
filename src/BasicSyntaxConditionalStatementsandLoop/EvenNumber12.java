package BasicSyntaxConditionalStatementsandLoop;

import java.util.Scanner;

public class EvenNumber12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isAllowed = false;
        while (!isAllowed) {
            int num = Math.abs(Integer.parseInt(sc.nextLine()));
            if (num % 2 == 0){
                isAllowed = true;
                System.out.printf("The number is: %d", num);
            } else {
                System.out.println("Please write an even number.");
            }
        }
    }
}
