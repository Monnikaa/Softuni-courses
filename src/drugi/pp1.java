package drugi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        StringBuilder text = new StringBuilder(email);

        String command = sc.nextLine();
        while (!command.equals("Complete")){
           String w1 = command.split(" ")[0];

           if (w1.equals("Make")){
               String w2 = command.split(" ")[1];
               if (w2.equals("Upper")){
                   for (int i = 0; i < text.length(); i++) {
                       char ch = text.charAt(i);
                       char upperCaseChar = Character.toUpperCase(ch);
                       text.setCharAt(i, upperCaseChar);
                   }

               }else if(w2.equals("Lower")){
                   for (int i = 0; i < text.length(); i++) {
                       char ch = text.charAt(i);
                       char lowerCaseChar = Character.toLowerCase(ch);
                       text.setCharAt(i, lowerCaseChar);
                   }
               }
               System.out.println(text);
           } else if (w1.equals("GetDomain")){
               int w2 =Integer.parseInt(command.split(" ")[1]);
               String update = text.substring(text.length()- w2);
               System.out.println(update);

           } else if (w1.equals("GetUsername")){
               if(text.toString().contains("@")){
                  int indx = text.indexOf("@");
                  String ww = text.substring(0,indx);
                  System.out.println(ww);
               } else {
                   System.out.printf("The email %s doesn't contain the @ symbol.%n",text);
               }

           } else if (w1.equals("Replace")){
               String w2 = command.split(" ")[1];
               for (int i = 0; i < text.length(); i++) {
                   String ch = String.valueOf(text.charAt(i));

                   if (ch.equals(w2)) {//toLowerCase
                       text.setCharAt(i, '-');
                   }
               }
               System.out.println(text);

           } else if (w1.equals("Encrypt")){
               List<String> list = new ArrayList<>();
               for (int i = 0; i < text.length(); i++) {
                   char ch = text.charAt(i);
                   list.add(String.valueOf((int)ch));
               }
               System.out.println(String.join(" ", list));
           }
           command = sc.nextLine();
        }
    }
}
