package assignment2;

import java.util.Scanner;

public class Question40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string...");
        String s1 = in.nextLine();

        Question40 revStg = new Question40();
        revStg.reverseString(s1);

    }
    public void reverseString(String s1){
        String s2 = "";
        for(int i = s1.length() - 1; i >= 0; i--){
            s2 = s2 + s1.charAt(i);
        }
        System.out.println("Reversed string is: "+s2);
    }
}
