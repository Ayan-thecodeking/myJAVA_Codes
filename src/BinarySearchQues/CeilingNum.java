package BinarySearchQues;

import java.util.ArrayList;
import java.util.Arrays;

public class CeilingNum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 7, 10, 11, 12, 19};
        int n = arr.length;
        int x = 8;
        int index = ceiling(arr, x);
        System.out.println(index);
    }
    static int ceiling(int[] arr ,int target){
          int start=0;
          int end = arr.length-1;
        if(end == 0){
            return -1;
        }
      /* this while loop function will run until condition not break once condition break
       loop will return start and ans is low which will be next smallest greater than target
       which is ceiling*/
        while(start <= end){
            int mid = start + (end - start)/2;//calculate mid

            if(target == arr[mid]){
                return mid;
            }
            if( target < arr[mid]){
                end = mid -1;
            }

            else{
                start = mid + 1;
            }
        }
        return end;
    }
}
