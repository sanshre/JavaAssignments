package assignments;

import java.util.Scanner;

public class PrintNameGoodFormat {
    public static void main(String[] args) {
        Scanner prsn = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = prsn.nextLine();
        System.out.println("Enter your Nationality");
        String nationality = prsn.nextLine();
        System.out.println("Enter your Roll");
        int roll = prsn.nextInt();
        System.out.println("Name: "+ name + "\n" + "Nationality: "+ nationality+"\n"+"Roll: "+roll);

    }
}
