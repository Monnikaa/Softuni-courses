package AssociativeArrays;

import java.util.*;

public class WordSynonyms_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Map<String, ArrayList<String>> map = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String word = sc.nextLine();
            String synonym = sc.nextLine();

            if (!map.containsKey(word)){
                map.put(word, new ArrayList<>());
            }
            map.get(word).add(synonym);
        }
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ",entry.getValue()));
        }
    }
}
