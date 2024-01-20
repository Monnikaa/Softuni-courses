package ExerciseObjectsAndClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Personn> peopleList = new ArrayList<>();
        String data = scanner.nextLine();

        while (!data.equals("End")) {

            String name = data.split("\\s+")[0];
            String id = data.split("\\s+")[1];
            int age = Integer.parseInt(data.split("\\s+")[2]);

            Personn person = new Personn(name, id, age);
            peopleList.add(person);

            data = scanner.nextLine();
        }


        peopleList.sort(Comparator.comparing(Personn::getAge));


        for (Personn person : peopleList) {
            System.out.println(person.getName() + " with ID: " + person.getId() + " is " + person.getAge() + " years old.");
        }
    }
}
