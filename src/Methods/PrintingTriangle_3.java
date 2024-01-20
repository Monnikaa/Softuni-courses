package Methods;

import java.util.Scanner;

public class PrintingTriangle_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
       
        printTrin(n);
    }

    public static void printTrin(int n) {
        for (int i = 1; i <= n; i++) {
            printLine(1, i);
        }
        for (int i = n -1; i >= 1 ; i--) {
            printLine(1, i);
        }
    }
    public static void printLine(int startInt, int endInt){
        for (int i = startInt; i <= endInt; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
