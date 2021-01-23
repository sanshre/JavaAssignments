package assignment2;

import java.util.Scanner;

public class Question41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string...");
        String s1 = in.next();
        duplicateLetter(s1);

    }
    public static void duplicateLetter(String str){
        char[] s = str.toCharArray();
        for(int i = 0; i < s.length; i++){
            int count = 1;
            for(int j = i+1; j < s.length;j++){
                if(s[i] == s[j]) {
                    count++;
                    s[j] = '0';
                }
            }
            if(count > 1 && s[i] != '0' ){
                System.out.println("Duplicate letter is " + s[i]);
            }
        }

    }
}
