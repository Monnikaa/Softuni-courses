package ExerciseBasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class Login05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String password = "";

        for (int position = username.length()-1; position >= 0; position--){
            char curS = username.charAt(position);
            password += curS;
        }

        String pass = sc.nextLine();
        for (int i = 1; i < 4; i++){

            if (pass.equals(password)){
                System.out.printf("User %s logged in.", username);
                return;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
            pass = sc.nextLine();
        }
        System.out.printf("User %s blocked!", username);
    }
}
