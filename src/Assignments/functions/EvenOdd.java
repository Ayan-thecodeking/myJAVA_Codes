package Assignments.functions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
      int n = input.nextInt();
        if ((n | 1) > n) {

            // Print statement
            System.out.println("Number is Even");
        }
        else {

            // Print statement
            System.out.println("Number is Odd");
        }

//     -------------------------------------   method 2  ----------------------------------------

//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        int ans = check(num);
//        System.out.println(ans);
//    }
//    static int check(int num){
//       int even;
//        while (true) {
//            if (num % 2 == 0) {
//                System.out.println("even");
//            } else {
//                System.out.println("odd");
//            }
//
//            return 0;
//
//        }
    }
}