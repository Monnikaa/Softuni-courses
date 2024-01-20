package TextProcessing;

import java.util.Scanner;

public class Substring_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text1 =sc.nextLine();
        String text2 =sc.nextLine();

        while (text2.contains(text1)){
            text2 = text2.replace(text1,"");
        }
        System.out.print(text2);
    }
}
