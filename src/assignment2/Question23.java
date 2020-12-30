package assignment2;

import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        for(int i = 1; i <= num; i++){
            i +=1;
            System.out.println(i);
        }
    }
}
