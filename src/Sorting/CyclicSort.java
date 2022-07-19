package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,4,1,2};
        search(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void search(int[] arr) {

        int i =0;
        while (i< arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }


    }

     static void swap(int[] arr, int i, int correct) {
         int temp = arr[i];
         arr[i] = arr[correct];
         arr[correct] = temp;
    }


}
