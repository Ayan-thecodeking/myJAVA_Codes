package tut4.Arr;

public class MAx {
    public static void main(String[] args) {
        int[] arr = { 7 ,22,33,23,2};
        int ans = Max(arr);
        System.out.println(ans );

    }
    static int  Max(int[] arr){
           int maxVal = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]> maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

}
