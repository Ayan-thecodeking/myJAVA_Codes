package Assignments.functions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int palindrome , check =0;
        int temp = number;

        while (number>0){
            int reminder = number%10;
            check = check*10 + reminder;
            number = number/10;

        }
        if (temp==check){
            System.out.println("true");

        }
        else
            System.out.println("false");

    }
}