package Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergingLists_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] fn = sc.nextLine().split(" ");
        String[] sn = sc.nextLine().split(" ");
        List<String> result = new ArrayList<>();

        int fnIndex = 0;
        int snIndex = 0;
        boolean fnTurn = true;
        while (fnIndex >= 0 && fnIndex < fn.length && snIndex >= 0 && snIndex < sn.length) {
            if (fnTurn) {
                result.add(fn[fnIndex]);
                fnIndex += 1;
                fnTurn = false;
            } else {
                result.add(sn[snIndex]);
                snIndex += 1;
                fnTurn = true;
            }
        }

        for (int i = snIndex; i < sn.length; i++) {
                result.add(sn[i]);
        }

        for (int i = fnIndex; i < fn.length; i++) {
                result.add(fn[i]);
        }
        System.out.print(String.join(" ", result));
    }
}
