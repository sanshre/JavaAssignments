package assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Question34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of an array:");
        int n = input.nextInt();
        int []arr1 = new int [n];
        for(int i = 0; i < n; i++) {
            System.out.println("Enter elements: ");
            arr1[i] = input.nextInt();

        }
        System.out.println("Array is: " + Arrays.toString(arr1));


        Question34 obj = new Question34();
        obj.ReverseArr(arr1,n);
    }
    public void ReverseArr(int a[],int n){
        int arr2[] = new int [n];
        int j = n;
        for(int i = 0; i < n ; i++){
            arr2[j-1] = a[i];
            j = j-1;
        }
        System.out.println("Reversed Array is : "+ Arrays.toString(arr2));
    }
}
