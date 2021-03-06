package leetcode;

public class RotatedBS {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(findpivot(nums));
    }

    static int search(int[] nums, int target) {
     int pivot = findpivot(nums);

     if (pivot==-1){
         return  Binarysearch(nums , target , 0,nums.length-1);
     }
     if (nums[pivot]==target){
         return pivot;

     }
     if (target>nums[pivot]){
         return Binarysearch(nums , target , pivot+1 , nums.length-1);
     }else {
         return Binarysearch(nums , target , 0,pivot-1 );

     }


    }

    static int Binarysearch(int[] arr , int target , int start , int end ) {


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                start = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    static int findpivot(int[] arr ){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start<mid && arr[mid-1]>arr[mid]){
                return mid-1;
            }if (arr[mid]<=arr[start]){
                end = mid-1;
            }else {
                start =mid+1;
            }
        }
        return -1;
    }
}
