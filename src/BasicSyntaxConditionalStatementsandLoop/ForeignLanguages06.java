package BasicSyntaxConditionalStatementsandLoop;

import java.util.Scanner;

public class ForeignLanguages06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String country = sc.nextLine();
        // for the others, we should print
        switch (country) {
            case "England":
                System.out.print("English");
                break;
            case "USA":
                System.out.print("English");
                break;
            case "Spain":
                System.out.print("Spanish");
                break;
            case "Argentina":
                System.out.print("Spanish");
                break;
            case "Mexico":
                System.out.print("Spanish");
                break;
            default:
                System.out.print("unknown");


        }
    }
}
