package JavAdvanced.StackAndQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        ArrayDeque<String> stack = new ArrayDeque<>();
        while (!"Home".equals(word)) {


            if("back".equals(word)){
                if(stack.size() <= 1){                    System.out.println("no previous URLs");
                } else{
                    stack.pop();
                    System.out.println(stack.peek());
                }
            } else {
                stack.push(word);
                System.out.println(word);
            }
            word = sc.nextLine();
        }

    }
}
