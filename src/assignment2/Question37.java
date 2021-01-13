package assignment2;

import java.util.Arrays;

public class Question37 {
    public static void main(String[] args) {
        int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] b = {{7,8,9},{4,5,6},{1,2,3}};
        System.out.println("Array a: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Array b : ");

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of two arrays is: ");
        System.out.print(sum2dArray(a,b));

    }
    public static int [][] sum2dArray(int [] [] arr1, int [] [] arr2){
        int [][] sum = {{0,0,0},{0,0,0},{0,0,0}};
        for (int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1.length;j++){
               sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1.length;j++){
                System.out.print(sum[i][j] +" ");
            }
            System.out.println();
        }

        return sum;
    }

}
