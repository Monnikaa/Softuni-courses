package ExerciseBasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class Ages01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.nextLine());

        if (age >= 0 && age <= 2){
            System.out.println("baby");
        } else if (age <= 13){
            System.out.println("child");
        } else if (age <= 19){
            System.out.println("teenager");
        } else if (age <= 65){
            System.out.println("adult");
        }  else if (age >= 66){
            System.out.println("elder");
        }
        //· >=66 – elder;

    }
}
