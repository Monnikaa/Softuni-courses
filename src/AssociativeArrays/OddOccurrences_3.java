package AssociativeArrays;

import java.util.*;

public class OddOccurrences_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputArr = sc.nextLine().split(" ");

        LinkedHashMap <String, Integer> map = new LinkedHashMap<>();
        for(String item : inputArr) {
            item = item.toLowerCase();

            if (!map.containsKey(item)) {
                map.put(item, 1);
            } else {
                int value = map.get(item);
                map.put(item, value + 1);
            }

        }
        List<String> result = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if (entry.getValue() % 2 != 0){
                result.add(entry.getKey());
            }
        }

            System.out.println(String.join(", ",result));
    }
}
