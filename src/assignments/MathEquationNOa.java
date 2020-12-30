package assignments;

import java.util.Scanner;

public class MathEquationNOa {
    public static void main(String[] args) {
        double s;
        Scanner eqn = new Scanner(System.in);
        System.out.println("Enter value of a ");
        double a =eqn.nextDouble();
        System.out.println("Enter value of velocity ");
        double u =eqn.nextDouble();
        System.out.println("Enter time  ");
        double t =eqn.nextDouble();

        s = u*t + 0.5*a*t*t;
        System.out.println("The distance covered is "+s);
    }
}
