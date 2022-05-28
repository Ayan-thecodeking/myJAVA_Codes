package leetcode;

public class Mountainarray1095 {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(array,target));
    }


        static int findInMountainArray( int[] array) {
            int start =0;
            int end = array.length-1;
            while(start<end){
                int mid = start+(end-start)/2;
                if(array[mid]>array[mid+1]){
                    end = mid;
                }else{
                    start = mid+1;
                }
            }
            return start; //or end anything
        }
        static int search(int[] array , int target){
            int peak = findInMountainArray(array);
            int firsttry= CheckOrder(array , target , 0 , peak);
            if(firsttry!=-1){
                return firsttry;
            }
            return CheckOrder(array , target , peak+1 ,array.length-1);

        }




    static int CheckOrder(int[] array , int target,int start , int end ){


            boolean isAsc = array[start]<array[end];
//        boolean isAsc ;
//        if (arr[start]<arr[end]){
//            isAsc =true;
//        }else {
//            isAsc = false;
//        }

            while (start<=end){
                int mid = start+(end-start)/2;

                if (array[mid]==target){
                    return mid;
                }

                if (isAsc) {
                    if (target>array[mid]) {
                        start=mid+1;
                    }else  {
                        start=mid-1;
                    }

                }else {
                    if (target<array[mid]) {
                        start=mid+1;
                    }else  {
                        start=mid-1;
                    }
                }

            }
            return -1;
        }
    }

