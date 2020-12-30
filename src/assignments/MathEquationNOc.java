package assignments;

import java.util.Scanner;

public class MathEquationNOc {
    public static void main(String[] args) {
        Scanner quad = new Scanner(System.in);
        System.out.println("Enter value a");
        double a = quad.nextDouble();
        System.out.println("Enter value b");
        double b = quad.nextDouble();
        System.out.println("Enter value c");
        double c = quad.nextDouble();
        double x= (-b + Math.sqrt((b*b - 4* a * c))/(2*a));
        System.out.println(x);
    }


}
