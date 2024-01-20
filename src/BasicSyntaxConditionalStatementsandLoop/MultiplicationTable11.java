package BasicSyntaxConditionalStatementsandLoop;

import java.util.Scanner;

public class MultiplicationTable11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());
        do {
            System.out.printf("%d X %d = %d%n", num, n, n*num);
            n++;
        } while (n <= 10);
    }
}
