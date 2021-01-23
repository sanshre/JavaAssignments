package assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Question42 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string...");
        String s1 = in.nextLine();
        Question42 dup = new Question42();
        dup.duplicateWord(s1);
    }
    public void duplicateWord(String s1){
        String[] arrStg = s1.split(" ");
        for (int i = 0; i < arrStg.length; i++){
            int cnt = 1;
            for(int j = i +1; j < arrStg.length;j++){
                if(arrStg[i].equalsIgnoreCase(arrStg[j])){
                    cnt++;
                    arrStg[j] = "null";
                }
            }
            if(cnt > 1 && arrStg[i]!="null"){
                System.out.println("Duplicate word is: "+arrStg[i]);
            }
        }

    }
}
