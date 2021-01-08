package assignment2;

import java.util.Scanner;

public class Question28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = in.nextInt();

        String isprime = isPrimeNumber(num);
        System.out.println(num + " " + isprime);
    }
        public static String isPrimeNumber(int a) {
            if (a == 1 || a == 0) {
                return "is not a prime number";
            }
            if(a==2||a==3||a==5||a==7)
                return " is a prime number";
            if(a%2==0 ||a%3==0||a%5==0||a%7==0){
                return "is not a prime number";
            }
            else
                return "is a prime number";


        }
}
