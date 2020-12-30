package assignment2;

import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

}
