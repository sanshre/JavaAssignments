package assignment2;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = input.nextInt();

        if(a % 2 == 0){

            System.out.println(a + " is even");
        }
        else {
            System.out.println(a + " is odd");
        }
    }
}
