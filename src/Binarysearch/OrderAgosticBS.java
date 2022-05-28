package Binarysearch;

public class OrderAgosticBS {
    public static void main(String[] args) {
        int[] arr ={8,22,31,35,44};
        int target = 8;
        System.out.println(CheckOrder(arr , target));

    }
    static int CheckOrder(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start]<arr[end];
//        boolean isAsc ;
//        if (arr[start]<arr[end]){
//            isAsc =true;
//        }else {
//            isAsc = false;
//        }

        while (start<=end){
            int mid = start+(end-start)/2;

            if (arr[mid]==target){
                return mid;
            }

            if (isAsc) {
                if (target>arr[mid]) {
                    start=mid+1;
                }else  {
                    start=mid-1;
                }

            }else {
                if (target<arr[mid]) {
                    start=mid+1;
                }else  {
                    start=mid-1;
                }
            }

        }
        return -1;


    }
}
