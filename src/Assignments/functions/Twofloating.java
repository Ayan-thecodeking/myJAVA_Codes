package Assignments.functions;

import java.util.Scanner;

public class Twofloating {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
// create scanner object
        System.out.print("Enter the first number: ");
        double num1=sc.nextDouble();
//this method reads value for num1 providing by user
        System.out.print("Enter the second number: ");
        double num2=sc.nextDouble();
//this method reads value for num2 providing by user
        sc.close();//closing the scanner class
        calcTotal(num1,num2); //calling the method
    }
    //calcTotal method
    public static void calcTotal(double num_A,double num_B){
        double result;
        result=num_A+num_B;
        System.out.println("Sum of two numbers %2d "+result);
    }

}
