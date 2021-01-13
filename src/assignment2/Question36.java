package assignment2;

import java.util.Arrays;

public class Question36 {
    public static void main(String[] args) {
        int [] arr = {3,6,7, 8, 7,19};
        System.out.println("Array is: "+ Arrays.toString(arr));
        int dup = Question36.FindDuplicate(arr,6);
        System.out.println("Duplicate elements of the array is: "+ dup);
    }
    public static int FindDuplicate(int []a,int n){
        int duplicate = 0;
        for (int i = 0; i < n; i++){
            for(int j = i +1; j < n; j++){
                if (a[i] == a[j])
                    duplicate = a[i];
            }
        }
        return duplicate;
    }
}
