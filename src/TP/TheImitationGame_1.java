package TP;

import java.util.Scanner;

public class TheImitationGame_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder text = new StringBuilder(sc.nextLine());
        String input = sc.nextLine();

//ChangeAll|z|l
//Insert|2|o
//Move|3
        while (!input.equals("Decode")){
            String comand = input.split("\\|")[0];

            if (comand.equals("Move")){
                int row = Integer.parseInt(input.split("\\|")[1]);
                String update = text.substring(0,row);
                text.replace(0,row, "");
                text.append(update);
            }else if (comand.equals("Insert")){
                //Insert {index} {value}":
                int ind = Integer.parseInt(input.split("\\|")[1]);
                String val = input.split("\\|")[2];
                text = text.insert(ind, val);
            }else if (comand.equals("ChangeAll")){
                String oldString = input.split("\\|")[1];
                String newString = input.split("\\|")[2];
                String update = text.toString().replace(oldString, newString);
                text = new StringBuilder(update);
            }
            input = sc.nextLine();
        }
        System.out.printf("The decrypted message is: %s", text);
    }
}
