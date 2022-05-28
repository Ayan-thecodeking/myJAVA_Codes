package Binarysearch;

public class Search {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,9,13,15,17,23,28};
        int target = 17;
        System.out.println(Binarysearch(arr , target));
    }
    static int Binarysearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;
          if (target>arr[mid]) {
              start=mid+1;
          }else if (target<arr[mid]) {
              start=mid-1;
          }else  {
              return mid;
          }
        }
        return -1;
    }
}
