package Assignments.functions;

import java.util.Scanner;

public class RetProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = input.nextInt();
        int b = input.nextInt();
       int ans = product(a,b);
        System.out.printf("product is : " + ans);

    }
    static int product(int a1 ,int a2){
        int product = 0;
        product =a1*a2;
        return product;
    }
}
