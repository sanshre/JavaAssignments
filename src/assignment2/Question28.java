package assignment2;

import java.util.Scanner;

public class Question28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = in.nextInt();

        isPrimeNumber(num);
    }
        public static void isPrimeNumber(int a){

                if(a/a == 0 && a/ != 0 ) {
                System.out.println(a +" is prime number");
                }
                else{
                    System.out.println(a +" is not a prime number");

                }

         }
}
