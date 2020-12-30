package assignment2;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any ASCII code: ");
        int a = input.nextInt();
        System.out.println("The character of ASCII code: "+ a +" is: "+ (char)a);
    }
}