package assignment2;

import java.util.Scanner;

public class Question31 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows to display the pattern: ");
        int count = input.nextInt();

        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");

        }
    }
}
