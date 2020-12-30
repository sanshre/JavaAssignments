package assignments;

import java.util.Scanner;

public class MathEquationNOb {
    public static void main(String[] args) {
        Scanner ar =new Scanner(System.in);
        System.out.println("Enter the value of a" );
        double a = ar.nextDouble();
        System.out.println("Enter the value of b " );
        double b = ar.nextDouble();
        System.out.println("Enter the value of c" );
        double c = ar.nextDouble();

        double s = 0.5*(a+b+c);
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area is "+area);
    }
}

