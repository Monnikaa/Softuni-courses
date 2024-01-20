package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Students> student = new ArrayList<>();


        while (true){
            String line = sc.nextLine();
            if (line.equals("end")){
                break;
            }
            String firstName = line.split(" ")[0];
            String lastName = line.split(" ")[1];
            int age = Integer.parseInt(line.split(" ")[2]);
            String homeTown = line.split(" ")[3];

            boolean exist = false;
            for (Students v : student){
                if (v.getFirstName().equals(firstName) && v.getLastName().equals(lastName)){
                    v.setAge(age);
                    v.setHomeTown(homeTown);
                    exist = true;
                }
            }
            if (!exist) {
                Students st = new Students(firstName, lastName, age, homeTown);
                student.add(st);
            }
        }
        String filterCity = sc.nextLine();
        for(Students v : student){
            if (v.getHomeTown().equals(filterCity)){
                System.out.println(v.getDetails());
            }
        }
    }
}
