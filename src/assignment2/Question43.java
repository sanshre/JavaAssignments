package assignment2;

import java.util.Scanner;

public class Question43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter b: ");
        int b = input.nextInt();
        int [] arr = new int[5];
        try {
            int result = div(a, b);
            arr[5] =  a+4;
        }
        catch (ArithmeticException ae){
            System.out.println("exception:"+ae);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Provide index less than size of an array: "+e);
        }

    }
    public static int div(int a,int b){
        return a/b;
    }

}
