package leetcode;

import java.util.Arrays;

public class missingnumbers {
    public static void main(String[] args) {
        int[] arr =  {3,1,5,2};

        sort(arr);
//        System.out.println(Arrays.toString(arr));
    }

    static int sort(int[] arr){
        int i = 0;
        while (i< arr.length){
            int correct = arr[i] - 1;
            if (arr[i]<arr.length &&arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }


        }
        for ( int index = 0; index< arr.length;index++){
            if (arr[index]!= index+1){
                return index;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr , int i , int correct){
        int temp  = arr[i] ;
        arr[i] = arr[correct];
        arr[correct] = temp;

    }
}