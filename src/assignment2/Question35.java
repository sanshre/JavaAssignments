package assignment2;

import java.util.Arrays;

public class Question35 {
    public static void main(String[] args) {
        int [] arr = {9,24,4,11,6,25};
        System.out.println("Array is : "+ Arrays.toString(arr));
        int maxSecond = secondLargestElement(arr,6);
        System.out.println("Second largest element of an array is: "+ maxSecond);

    }
    public static int secondLargestElement(int []a, int n){
        Arrays.sort(a);
        return a[n - 2];
    }
}
