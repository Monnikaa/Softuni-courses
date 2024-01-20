package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int[] arr = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++){

            if (arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        System.out.print(sum);
    }
}
