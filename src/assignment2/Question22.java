package assignment2;

import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to which you want the table ");
        int num = in.nextInt();

        for(int i = 0; i <= num; i++){
            System.out.println(i);
        }

    }
}
