package assignment2;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = input.nextInt();
        System.out.println("Enter the second number");
        int b = input.nextInt();

        if (a > b){
            System.out.println(a +" > "+ b);
        }
        else if (a == b){
            System.out.println(a +" == "+ b);
        }
        else{
            System.out.println(a +" < "+ b);
        }
    }
}
