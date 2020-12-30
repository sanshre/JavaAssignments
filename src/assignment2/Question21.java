package assignment2;

import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int day = input.nextInt();

        switch(day){
            case 1:
                System.out.println("The first day of week is Sunday");
                break;
            case 2:
                System.out.println("The second day of week is Monday");
                break;
            case 3:
                System.out.println("The third day of week is Tuesday");
                break;
            case 4:
                System.out.println("The fourth day of week is Wednesday");
                break;
            case 5:
                System.out.println("The fifth day of week is Thursday");
                break;
            case 6:
                System.out.println("The sixth day of week is Friday");
                break;
            case 7:
                System.out.println("The seventh day of week is Saturday");
                break;
            default:
                System.out.println("Wrong day");

        }
    }
}
