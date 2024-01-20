package ObjectsAndClasses;

import java.util.*;
import java.util.stream.Collectors;

public class RandomizeWords_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> word = Arrays.stream(sc.nextLine()
                        .split(" "))
                .collect(Collectors.toList());

        Random rnd = new Random();
        int wWord = word.size();

        for (int pos = 0; pos < wWord; pos++) {
            int indx = rnd.nextInt(word.size());

            System.out.println(word.get(indx));
            word.remove(indx);
        }
    }
}
