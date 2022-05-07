package Linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {11,3,34,-4,76,-9,44};
        int target = 44;
        int first=2;
        int last =4;
        int ans = search(arr,target ,first ,last);
        System.out.println(ans);
    }
    static int search(int[] arr , int target,int start , int end ){
        for (int i = start; i <end ; i++) {
            int element = arr[i];
            if (element==target){
                return i;
            }
        }
        return -1;
    }
}

