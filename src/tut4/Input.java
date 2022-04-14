package tut4;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

     int[] arr = new int[5];
        for (int i = 0; i< arr.length ; i++){
            arr[i] = input.nextInt();
//            System.out.println(arr[i]);
       }

        for(int num : arr ){
            System.out.print(num+ " ");
        }
    }
}
