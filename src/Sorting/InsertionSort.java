package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[]  arr  = {64,25,14,22,11};
        search(arr);
       System.out.println(Arrays.toString(arr));
    }


     static void search(int[] arr) {
         for (int i = 0; i < arr.length-1; i++) {
             for (int j = i+1; j>0 ; j--) {
                 if (arr[j-1]>arr[j]){
                     swap(arr,j-1,j);
                 }else{
                     break;
                 }


             }
         }

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
