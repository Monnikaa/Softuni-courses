package drugi;

import java.util.Scanner;

public class ThePianist_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
//3
//Fur Elise|Beethoven|A Minor
//Moonlight Sonata|Beethoven|C# Minor
//Clair de Lune|Debussy|C# Minor
        for (int i = 1; i <= 3; i++) {
            String text = sc.nextLine();
            String piece = text.split("\\|")[0];
            String composer = text.split("\\|")[1];
            String key = text.split("\\|")[2];

        }
        // "{piece}|{composer}|{key}".
        String input = sc.nextLine();

        while (!input.equals("Stop")){
            String w1 = input.split("\\|")[0];

            if(w1.equals("Add")){
                //"Add|{piece}|{composer}|{key}":
                //piece} by {composer} in {key} added to the collection!"
            } else if (w1.equals("Remove")){

            }else if (w1.equals("ChangeKey")){

            }

            input = sc.nextLine();
        }
    }
}
