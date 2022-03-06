package Assignments.functions;

import java.util.Scanner;

public class A4to7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();

        int num2 = input.nextInt();

        int sum = sum(num1,num2);
        System.out.println(sum);
    }
    static int sum(int numA,int numB){
       int sum = 0;
       sum = numA + numB;
        return sum;
//     System.out.println("sum = " + sum );
    }
}
