package TP;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texs = sc.nextLine(); //Hawai::Cyprys-Greece
        StringBuilder ttext = new StringBuilder(texs);

        String comnda = sc.nextLine();

        while (!comnda.equals("Travel")){
            String w1 = comnda.split(":")[0];

            if(w1.contains("Add")){
                int w2 = Integer.parseInt(comnda.split(":")[1]);
                String w3 = comnda.split(":")[2];

                if( w2 >= 0 && w2<=ttext.length()) {
                    ttext.insert(w2, w3);
                }
                System.out.println(ttext);

            } else if(w1.contains("Remove")){
                int w2 = Integer.parseInt(comnda.split(":")[1]);
                int w3 = Integer.parseInt(comnda.split(":")[2]);
                if (w2 >= 0 && w2 <= ttext.length() && w3>w2 && w3 <= ttext.length()){
                    ttext.delete(w2,w3+1);
                }
                System.out.println(ttext);
            } else if(w1.contains("Switch")){
                //Switch:{old_string}:{new_string}":
                String w2 = comnda.split(":")[1];
                String w3 = comnda.split(":")[2];
                if (ttext.toString().contains(w2)) {
                    String update = ttext.toString().replace(w2, w3);
                    ttext = new StringBuilder(update);
                }
                System.out.println(ttext);
            }
            comnda = sc.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s",ttext);
    }
}
