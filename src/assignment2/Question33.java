package assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of an array:");
        int n = input.nextInt();
        int []arr = new int [n];

        for (int i = 0; i < n; i++){
            System.out.println("Enter elements of an array:");
            int element = input.nextInt();
            arr[i] = element;
        }
        System.out.println("Array before sorting "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Array after sorting "+ Arrays.toString(arr));

    }
}
