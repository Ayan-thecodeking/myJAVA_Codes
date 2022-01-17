package tut3;

import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        sum();
    }

    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1st no : ");
        int num1= input.nextInt();
        System.out.println("enter 2nd no : ");
        int num2= input.nextInt();

        int sum = num1 +num2;
        System.out.println("sum is : "+sum);

    }

//    return_type name (){
//        body
//                return statement;
//    }
}
