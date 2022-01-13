package ayan;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int no1= input.nextInt();
//        int no2= input.nextInt();
//        int sum = no1 + no2 ;
//        System.out.println("sum ="+sum);

              //type casting
//         int num = (int)(99.044);
//        System.out.println(num);
//        automatic type promotion in expression


//        int a = 258;
//        byte b= (byte)(a);
//        System.out.println(b);

        byte b =42;
        char c ='a';
        short s = 1022;
        int i= 10020;
        float f = 5.24f;
        double d =0.3435;
        double result = (f*b)+(i/c)-(d*s);
        System.out.println((f*b)+" "+(i/c)+" "+(d*s));
        }

}
