package assignment2;

import java.util.Scanner;

public class Question29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a  positive number: ");
        int n = in.nextInt();
        double a = 1;

        for(int i = 2; i <= n; i++){
            a = a + i/(double)fact(i);
        }
        System.out.println("Value of a is : " + a);

    }

     static  int  fact(int b) {
        if (b<=1)
            return 1;

        return b * fact(b - 1);
    }
}
