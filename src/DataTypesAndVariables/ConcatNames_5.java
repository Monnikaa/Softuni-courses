package DataTypesAndVariables;

import java.util.Scanner;

public class ConcatNames_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fN = sc.nextLine();
        String sN = sc.nextLine();
        String d = sc.nextLine();
        System.out.printf("%s%s%s",fN,d,sN);
    }
}
