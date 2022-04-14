package tut4;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[][] array =  new int[3][3];

//        int[][] array2D = {
//                {1,3,43},{3,5},{1,35,4,3}
//        };
//        System.out.println(array[1][0]);

        for (int row = 0; row< array.length;row++){
            for (int col =0; col < 3;col++){
               array[row][col] = input.nextInt();
            }
        }

                     //way 1 to take  output



//        for (int row =  0; row< array.length;row++){
//            for (int col =0; col < array[row].length; col++){
//                System.out.print(array[row][col] + " ");
//            }
//            System.out.println("");
//        }

        //way 2 to take  output

//        for (int row = 0; row< array.length;row++){
//            System.out.println(Arrays.toString(array[row]));
//        }


        //way 3 to take  output
//        enhanced way


        for(int[] a : array){
            System.out.println(Arrays.toString(a));
        }

    }
}
