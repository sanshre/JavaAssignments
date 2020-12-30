package assignments;

import java.util.Scanner;

public class PoundToKg {
    public static void main(String[] args) {
        Scanner wtg = new Scanner(System.in);
        System.out.println(" Enter weight in pounds ");
        double pnd = wtg.nextDouble();
        System.out.println(pnd + " pounds is equals to "+ poundToKg(pnd)+ " kgs ");

    }
    public static double poundToKg(double p){
        return (p*0.454);
    }
}
