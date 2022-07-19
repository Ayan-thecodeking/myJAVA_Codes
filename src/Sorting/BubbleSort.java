package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr = {4,3,6,2,7,5};
        int[] arr = {1,2,3,4,5};
          sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr ){
        boolean swappped ;
        int swap =0;

        for (int i = 0; i < arr.length ; i++) {
            swappped = false;
            for ( int j = 1;  j < arr.length-i; j++) {

                if (arr[j - 1] > arr[j]) {
                    swap = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = swap;

                }
            }
            if (!swappped){
                break;
        }

        }
    }
}
