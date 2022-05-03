package Linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {11,3,34,-4,76,-9,44};
        int target = 76;
        int ans = search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] arr , int target){
        for (int i = 0; i <arr.length ; i++) {
            int element = arr[i];
            if (element==target){
                return i;
            }
        }
        return -1;
    }
}
