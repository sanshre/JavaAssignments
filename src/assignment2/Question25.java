package assignment2;

import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numStudents = in.nextInt();
        String[] stdNam = new String[numStudents];
        int[] stdScore = new int[numStudents];
        int s = 0;
        int index = 0;
        for(int i = 0; i < numStudents; i++){
            System.out.println("Enter name of the student: ");
            String name = in.next();
            System.out.println("Enter score of "+name + " : " );
            int score = in.nextInt();
            stdNam[i] = name;
            stdScore[i] = score;
            if(score > s){
                s = score;
                index = i;
            }

        }


        System.out.println(stdNam[index] +" has the highest score: "+ stdScore[index]);


    }
}
