package Sorting;

import java.util.Arrays;

public class SelecctionSort {
    public static void main(String[] args) {
     int[]  arr  = {64,25,14,22,11};
     search(arr);
//        System.out.println(Arrays.toString(arr));
        for(int i:arr){
            System.out.print(i+" ");
        }
    }


    static void search(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1 ; j < arr.length ; j++) {
                if (arr[min]>arr[j]){
                    min = j;
                }
//                if (min!=i)
//                {
//                    int temp = arr[min];
//                    arr[min] = arr[i];
//                    arr[i] = temp;
//                }

            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

    }
}
