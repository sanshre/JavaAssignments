package assignments;

import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner tmp = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        double faren = tmp.nextDouble();
        System.out.println(faren +" F is "+ farenToCelc(faren)+ " in Celsius " );

        System.out.println("Enter temperature in Celsius");
        double celc = tmp.nextDouble();
        System.out.println(celc +" C is "+ farenToCelc(celc)+ " in Fahrenheit " );

    }
    public static double farenToCelc(double f){
        return (f-32)*5/9;
    }
    public static double celcToFaren(double c){
        return (c*9/5)+ 32;
    }
}
