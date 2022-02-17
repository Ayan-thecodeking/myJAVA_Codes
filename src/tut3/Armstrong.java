package tut3;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("enter no to check :");
        System.out.println(isArmstrong(n));

    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n>0){
            int rem = n%10;
            int cube = rem*rem*rem;
            n = n/10;
            sum =  sum + cube;
        }
       return sum == original;
    }
}

//        int a = input.nextInt();
//        int temp = a;
//        int sum = 0;
//        while (true) {
//            while (a > 0) {
//                int rem = a % 10;
//                int cube = rem * rem * rem;
//                sum = sum + cube;
//                a = a / 10;
//            }
//            if (sum == temp) {
//                System.out.println("true");
//            } else System.out.println("false");
//        }