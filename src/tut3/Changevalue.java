package tut3;

import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
        int arr[] = {0,44,24,2,434};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr) {
        arr[0]=99;
    }

}
