package assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Question32 {
    public static void main(String[] args) {
        int sumOfArray = 0;
        int []arr = new int [5];

        for (int i = 0; i < arr.length; i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter elements of an array:");
            int element = input.nextInt();
            arr[i] = element;
        }
        System.out.println("Array before sorting "+ Arrays.toString(arr));

        for(int i = 0; i < arr.length;i++){
            sumOfArray = sumOfArray + arr[i];
        }
        System.out.println("Sum of array is: "+ sumOfArray);
    }
}
