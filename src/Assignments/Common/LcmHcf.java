package Assignments.Common;

import java.util.Scanner;

public class LcmHcf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a , b , x,y, t,lcm,hcf;
        a = input.nextInt();
        b = input.nextInt();
         x =a;
         y=b;

         while (y!=0){
             t = y;
             y=x%y;
             x = t;
         }
         hcf = x;
         lcm = a*b/hcf;
        System.out.println("hCF is "+ hcf);
        System.out.println("LCM is  "+ lcm);
    }
}
