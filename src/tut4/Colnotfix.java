package tut4;

import java.util.Arrays;

public class Colnotfix {
    public static void main(String[] args) {
         int[][] arr = {
                 {1,2,4,5,6},{1,78,3},{23,54,3}
         };
//        for (int row = 0; row < arr.length ; row++) {
//            for (int col = 0; col <arr[row].length ; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println(" ");
//        }

//        second way

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

    }
}
