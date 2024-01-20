package ExerciseAssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class Courses_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        LinkedHashMap<String, List<String>> arrMap = new LinkedHashMap<>();
        while (!input.equals("end")){

            String cours = input.split(" : ")[0];
            String student = input.split(" : ")[1];

            if(!arrMap.containsKey(cours)) {
                arrMap.put(cours, new ArrayList<>());
            }
                arrMap.get(cours).add(student);

            input = sc.nextLine();
        }
        arrMap.entrySet().forEach(entry ->
                { System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
                });
    }
}
