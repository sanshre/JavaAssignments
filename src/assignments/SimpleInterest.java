package assignments;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter the amount of principal.");
        double principal = abc.nextDouble();
        System.out.println("Enter the time duration of the investement.");
        double time = abc.nextDouble();
        System.out.println("Enter the rate of interest");
        double rate = abc.nextDouble();

        double sI = (principal*time*rate)/100;
        System.out.println("The simple interst is " + sI);

    }
}
