package Methods;

import java.util.Scanner;

public class Calculations_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int firstNum = Integer.parseInt(sc.nextLine());
        int secondNum = Integer.parseInt(sc.nextLine());

        if(input.equals("add")){
            add(firstNum, secondNum);
        } else if(input.equals("multiply")){
            multiply(firstNum, secondNum);
        } else if(input.equals("subtract")){
            subtract(firstNum, secondNum);
        } else if(input.equals("divide")){
            divide(firstNum, secondNum);
        }
    }
    public static void add(int firstNum, int secondNum){
        int sum = firstNum + secondNum;
        System.out.println(sum);
    }
    public static void multiply(int firstNum, int secondNum){
        int result = firstNum * secondNum;
        System.out.println(result);
    }
    public static void subtract(int firstNum, int secondNum){
       if (firstNum > secondNum){
           int result = firstNum - secondNum;
           System.out.println(result);
       } else {
           int result = secondNum - firstNum;
           System.out.println(result);
       }
        
    }
    public static void divide(int firstNum, int secondNum){
        int result = firstNum / secondNum;
        System.out.println(result);
    }
}
