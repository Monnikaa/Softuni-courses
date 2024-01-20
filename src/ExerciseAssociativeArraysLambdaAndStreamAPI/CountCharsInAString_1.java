package ExerciseAssociativeArraysLambdaAndStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class CountCharsInAString_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> words = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for (String word : words){
            for (int i = 0; i < word.length() ; i++) {
                char ch = word.charAt(i);
                if(!map.containsKey(ch)){
                    map.put(ch, 1);
                } else {
                    int value = map.get(ch);
                    map.put(ch, value + 1);
                }
            }
        }
        map.forEach((key, value) -> System.out.println(key + " -> " +value));
    }
}
