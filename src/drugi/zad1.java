package drugi;

import java.util.*;

public class zad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < num; i++) {
            String input = sc.nextLine();
            String name = input.substring(input.indexOf("@") + 1, input.indexOf("|"));
            String age = input.substring(input.indexOf("#") + 1, input.indexOf("*"));
            System.out.printf("%s is %s years old.%n", name, age);
        }
    }
}
