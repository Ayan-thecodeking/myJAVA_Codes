package Linearsearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {3,43,24,-5,43,1,37};
        int ans = min(arr);
        System.out.println(ans);
    }
    static int min(int[] arr){
        int small = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]<small){
//                small = arr[i];
//            }
//        }

        for (int i:
             arr) {
            small=Math.min(small,i);
        }

        return small;
    }
}
