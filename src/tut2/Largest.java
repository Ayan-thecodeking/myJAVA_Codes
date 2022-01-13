package tut2;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//        Q: find the largest of 3 num
//        int max = a;
//        if (b>max){
//            max = b;
//        }if (c>max){
//            max=c;
//        }
//        System.out.println(max);

        //        method 2

//        int max = 0;
//        if (a>b){
//            max = b;
//        }else {
//            max =a ;
//        }
//        if (c>max){
//            max =c;
//        }
//        System.out.println(max);
//
        int max =Math.max(c,Math.max(a,b));
        System.out.println(max);
  }
}
