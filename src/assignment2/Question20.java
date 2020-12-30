package assignment2;

import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNum = input.nextInt();
        System.out.println("Enter the second number: ");
        int secondNum = input.nextInt();
        System.out.println("Enter the symbol: '+' or '-' or '/' or '*' ");
        char operator = input.next().charAt(0);

        int result = 0;

        switch(operator){
            case '+':
                result = firstNum + secondNum;
                break;
            case '-':
                result = firstNum - secondNum;
                break;
            case '/':
                result = firstNum / secondNum;
                break;
            case '*':
                result = firstNum * secondNum;
                break;
            default:
                System.out.println("***Wrong operator***");

        }
        System.out.println(result);

    }
}
