package assignment2;

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle: ");
        int a = input.nextInt();
        System.out.println("Enter the second side of the triangle: ");
        int b = input.nextInt();
        System.out.println("Enter the  third side of the triangle: ");
        int c = input.nextInt();

        if(a == b && b == c){
            System.out.println("The given triangle is equilateral");
        }
        else if(a == b || b == c || a == c ){
            System.out.println("The given triangle is isosceles");
        }
        else{
            System.out.println("The given triangle is scalene");
        }

    }
}
