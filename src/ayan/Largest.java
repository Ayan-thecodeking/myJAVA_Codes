package ayan;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
//        int max = 0;

//        if (b>a){
//      max = b;
//        } if (c>b){
//            max =c;
//        }

        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
