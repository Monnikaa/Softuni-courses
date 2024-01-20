package drugi;

import java.util.Scanner;

public class NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <=3 ; i++) {
            //"{car}|{mileage}|{fuel}"
            String text = sc.nextLine();
            String car = text.split("\\|")[0];
            String mileage = text.split("\\|")[1];
            String fuel = text.split("\\|")[2];

        }
    }
}
