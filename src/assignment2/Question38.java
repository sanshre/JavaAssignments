package assignment2;

import java.util.Scanner;

public class Question38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string...");
        String s1 = in.next();

        Question38.isPalindrome(s1);
    }
    public static void isPalindrome(String a){
        String b = "";
        for(int i = a.length()-1; i >= 0; i--){
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
            System.out.println("The given string is a Palindrome..");
        else
            System.out.println("The given string is  not a Palindrome..");
    }
}
