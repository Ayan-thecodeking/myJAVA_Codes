package tut3;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
//        write a program using function to verify a pt=rime no
        Scanner input = new Scanner(System.in);
        System.out.println("enter the no :");
        int n = input.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }
    static boolean isPrime(int n){
       if (n<=1){
           return false;
        }
       int c=2;
       while (c*c<=n){
           if (n%c==0){
              return false;
           }
           c++;
       }
       return c*c>n;
    }
}
