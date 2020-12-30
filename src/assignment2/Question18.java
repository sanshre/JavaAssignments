package assignment2;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the first number: ");
        int b = input.nextInt();
        System.out.println("Enter the first number: ");
        int c = input.nextInt();

        if(a > b) {
            if (a > c) {
                System.out.println(a + " is the largest number ");
            }
            else {
                System.out.println(c + " is the largest number ");
            }
        }
        else {
            if(b > c){
                System.out.println(b + " is the largest number ");
            }
            else {
                System.out.println(c + " is the largest number ");
            }

        }
    }
}
