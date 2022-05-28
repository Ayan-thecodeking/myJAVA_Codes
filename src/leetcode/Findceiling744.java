package leetcode;

public class Findceiling744 {
    public static void main(String[] args) {
        int arr[] = {'c','f','j'};

        int x = 'j';
        int index = ceiling(arr, x);
        System.out.println(index);
    }

    private static int ceiling(int[] letters, int x) {
        int start =0;
        int end = letters.length-1;

        while (start<=end){
            if (end==0){
                return 0;
            }
            int mid = start + (end-start)/2;

            if( x < letters[mid]){
                end = mid -1;
            }

            else{
                start = mid + 1;
            }
        }
        return letters[start% letters.length];
    }
}
