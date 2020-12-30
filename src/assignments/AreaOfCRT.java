package assignments;
import java.util.Scanner;

public class AreaOfCRT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the raidus of circle");
        double radius = in.nextDouble();
        double areaCircle = areaOfCircle(radius);
        System.out.println("The area if circle is "+ areaCircle);

        System.out.println("Enter the length of rectangle");
        double length = in.nextDouble();
        System.out.println("Enter the width of rectangle");
        double width = in.nextDouble();
        double rectangleArea = areaOfRectangle(length,width);
        System.out.println("The Area of rectangle is " + rectangleArea);

        System.out.println("Enter the base of triangle");
        double base = in.nextDouble();
        System.out.println("Enter the height of triangle");
        double height = in.nextDouble();
        double triangleArea = areaOfTriangle(base,height);
        System.out.println("The Area of triangle is " + triangleArea);

        }
        public static double areaOfCircle(double r){
        return Math.PI*r*r;
        }
        public static double areaOfRectangle(double l,double w){
        return (l * w);
        }
        public static double areaOfTriangle(double b,double h){
        return (0.5*b * h);
    }

}
