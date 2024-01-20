package JavAdvanced.StackAndQueue;

import java.util.*;

public class SimpleCalculator_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input = sc.nextLine();

        String[] tok = input.split("\\s+");
        Deque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack,tok);
        while (stack.size() > 1){
            int fNum = Integer.parseInt(stack.pop());
            String op = stack.pop();
            int sNum = Integer.parseInt(stack.pop());

            if(op.equals("+")){
                stack.push(String.valueOf(fNum + sNum));
            } else if(op.equals("-")){
                stack.push(String.valueOf(fNum - sNum));
            }
        }
        System.out.println(stack.pop());
    }
}
