package Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> num = Arrays.stream(sc.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
// 23341
        for (int index = 0; index < num.size() -1; index++){
            double currentNum = num.get(index);
            double rightNum = num.get(index + 1);
            if (currentNum == rightNum){
                double newNum = currentNum + rightNum;
                num.remove(index + 1);
                num.set(index, newNum);
                index = -1;
            }
        }
        for (double v : num){
            System.out.print(new DecimalFormat("0.###").format(v) + " ");
        }
    }
}
