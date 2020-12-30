package assignments;
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner add = new Scanner(System.in);
        System.out.println("Enter the first number.");
        int num1 = add.nextInt();
        System.out.println("Enter the second number.");
        int num2 = add.nextInt();

        System.out.println("The sum of two numbers is "+ sum(num1,num2));
        System.out.println("The average of two numbers is "+ average(num1,num2));
    }
    public static int sum(int a, int b){
        return a + b;
    }
    public static int average(int a, int b){
        return(a + b)/2;
    }
}
