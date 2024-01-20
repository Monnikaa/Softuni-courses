package drugi;

import java.util.*;
import java.util.stream.Collectors;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        StringBuilder ppassword = new StringBuilder(password);
        String comand = sc.nextLine();

        while (!comand.equals("Complete")) {
            String w1 = comand.split(" ")[0];

            if (w1.equals("Replace")) {
                String w2 = comand.split(" ")[1];
                int w3 = Integer.parseInt(comand.split(" ")[2]);
                if(ppassword.toString().contains(w2)) {
                    int ww2 = Integer.parseInt(w2);
                    int result = ww2 + w3;
                    char ch = (char) result;
                 //   String update = ppassword.toString().replace(w2, ch);
                   // ppassword = new StringBuilder(update);
                    System.out.println(ppassword);
                }

            } else if (w1.equals("Insert")) {
                int w2 = Integer.parseInt(comand.split(" ")[1]);
                String w3 = comand.split(" ")[2];
                if (w2 < ppassword.length() || w2 == ppassword.length() && w2 >= 0) {
                    ppassword.insert(w2, w3);
                    System.out.println(ppassword);

                }
            } else if (w1.equals("Make")) {
                String w2 = comand.split(" ")[1];
                int w3 = Integer.parseInt(comand.split(" ")[2]);
                if (w2.equals("Upper")) {
                    String word = String.valueOf(ppassword.charAt(w3));
                    String newW = ppassword.toString().replace(word, word.toUpperCase());
                    ppassword = new StringBuilder(newW);
                    System.out.println(ppassword);

                } else if (w2.equals("Lower")) {
                    String word = String.valueOf(ppassword.charAt(w3));
                    String newW = ppassword.toString().replace(word, word.toLowerCase());
                    ppassword = new StringBuilder(newW);
                    System.out.println(ppassword);
                }
            } else if (w1.equals("Validation")) {
                if (ppassword.length() < 8){
                    System.out.println("Password must be at least 8 characters long!");
                }

                for (int i = 0; i < ppassword.length(); i++) {
                    Character ch = ppassword.charAt(i);
                    if (!Character.isLetterOrDigit(ch) || !ch.equals("_")) {
                        System.out.println("Password must consist of only letters, numbers and underscore!");
                    }
                }
                boolean upCase = true;
                for (int i = 0; i < ppassword.length(); i++) {
                    Character ch = ppassword.charAt(i);
                    if (Character.isUpperCase(ch)) {
                        upCase = false;
                        System.out.println("Password must consist of at least one uppercase letter!");
                    }
                    if(upCase){
                        System.out.println("Password must consist of at least one uppercase letter!");
                    }
                }
            }
            comand = sc.nextLine();
        }
        System.out.print(ppassword);
    }
}
