package ExerciseBasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(sc.nextLine());
        int countOfStudents = Integer.parseInt(sc.nextLine());
        double lightsabers = Double.parseDouble(sc.nextLine());
        double robe = Double.parseDouble(sc.nextLine());
        double belt = Double.parseDouble(sc.nextLine());

        double L = Math.ceil(countOfStudents + 0.10 * countOfStudents) * lightsabers;
        double R = countOfStudents * robe;
        double B = (countOfStudents - countOfStudents / 6) * belt;

        double sum = L + R + B;
        if (sum <= amountOfMoney){
            System.out.printf("The money is enough - it would cost %.2flv.", sum);
        } else {
            sum -= amountOfMoney;
            System.out.printf("George Lucas will need %.2flv more.", sum);
        }

    }
}
