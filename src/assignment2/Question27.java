package assignment2;

import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = in.nextInt();
        int i = 0;
        int sum = 0;
        int product = 1;
        while(num != 0){
            i = num % 10 ;
            sum = sum + i;
            product = product * i;
            num = num /10;
        }
        System.out.println("The sum of each digit the given number is: "+ sum);
        System.out.println("The product of each digit the given number is: "+ product);


    }
}
