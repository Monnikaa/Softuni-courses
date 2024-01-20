package ExerciseAssociativeArraysLambdaAndStreamAPI;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class ForceBook_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")){
            if(input.contains("|")){
                String team = input.split(" \\| ")[0];
                String player = input.split(" \\| ")[1];
                if(!map.containsKey(team)) {
                    map.put(team, new ArrayList<>());

                }
                boolean isExist = false;
                for(List<String> list : map.values()){
                    if(list.contains(player)){
                        isExist = true;
                        break;
                    }
                }
                if(!isExist){
                    map.get(team).add(player);
                }
            }else if(input.contains("->")){
                String team = input.split(" -> ")[0];
                String player = input.split(" -> ")[1];

                map.entrySet().forEach(entryTeam -> entryTeam.getValue().remove(player));
                if(!map.containsKey(team)){
                    map.put(team, new ArrayList<>());
                    map.get(team).add(player);
                } else{
                    map.get(team).add(player);
                }

                System.out.printf("%s joins the %s side!%n",player ,team);
            }
            input = sc.nextLine();
        }
        map.entrySet()
                .stream().filter( entry -> entry.getValue().size() >0)
                .forEach(entry -> {
                    System.out.println("Side: " + entry.getKey() + ", Members: "+ entry.getValue().size());
                    entry.getValue().forEach(player -> System.out.println("! " + player));
                });
    }
}
