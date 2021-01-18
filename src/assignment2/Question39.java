package assignment2;

import java.util.Scanner;

public class Question39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string...");
        String s1 = in.nextLine();
        Question39.nameInShortForm(s1);

    }
    public static void nameInShortForm(String abc){
        System.out.print(abc.charAt(0) + ". ");
        int i = abc.indexOf(' ');
        System.out.print(abc.charAt(i + 1) + ". ");
         int i2 = abc.indexOf(' ',i + 1 );
        System.out.println(abc.substring(i2));
    }
}
