package Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> num = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> result = new ArrayList<>();
        if (num.size() % 2 != 0){
            int mid = num.size() / 2;
            num.add(mid, 0);
        }
        for (int i = 0; i < num.size() / 2; i++){
            int fn = num.get(i);
            int ln = num.get(num.size()-i -1);
            result.add(fn + ln);
        }
        for(int v : result){
            System.out.print(new DecimalFormat("0").format(v) + " ");
        }
    }
}
