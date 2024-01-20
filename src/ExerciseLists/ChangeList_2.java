package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> number = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String tekt = sc.nextLine();
        while (!tekt.equals("end")){
            String t1 = tekt.split(" ")[0];
            if (t1.equals("Delete")){
                int n = Integer.parseInt(tekt.split(" ")[1]);
                number.remove(Integer.valueOf(n));
            } else if (t1.equals("Insert")){
                int n1 = Integer.parseInt(tekt.split(" ")[1]);
                int n2 = Integer.parseInt(tekt.split(" ")[2]);
                number.add(n2, n1);
            }
            tekt = sc.nextLine();
        }
        for(int v : number){
            System.out.print(v + " ");
        }
    }
}
