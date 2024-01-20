package ExerciseBasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());

        int headset = 0;
        int mouse = 0;
        int keyboard = 0;
        int times = 0;
        int display = 0;
        for (int i = 1; i <= lostGamesCount; i++){
            if (i % 2 == 0){
                headset ++;
            }
            if (i % 3 == 0){
                mouse ++;
            }
            if (i % 6 == 0){
                keyboard ++;
            }
            if (i % 12 == 0){
                display ++;
            }
        }
        double result = (headset * headsetPrice) + (mouse * mousePrice) + (keyboard * keyboardPrice) + (display * displayPrice);
        System.out.printf("Rage expenses: %.2f lv.", result);
    }
}
