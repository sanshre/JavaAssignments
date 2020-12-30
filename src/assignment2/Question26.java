package assignment2;

import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int rev = in.nextInt();
        int i = 0;
        while(rev != 0){
            i = (i * 10) + (rev % 10 );
            rev = rev /10;
        }
        System.out.println("The reverse of the number is: "+ i);
    }
}
