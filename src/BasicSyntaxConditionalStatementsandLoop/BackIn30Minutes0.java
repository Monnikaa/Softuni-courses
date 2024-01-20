package BasicSyntaxConditionalStatementsandLoop;

import java.util.Scanner;

public class BackIn30Minutes0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hours =Integer.parseInt(sc.nextLine());
        int min = Integer.parseInt(sc.nextLine());

         int hvm = hours * 60;
         int chas = hvm + min;
         int vreme = chas + 30;
         int h = vreme / 60;
         int m = vreme % 60;

         if (h > 23){
             h = 0;
         }

         System.out.printf("%d:%02d", h, m);
    }
}
