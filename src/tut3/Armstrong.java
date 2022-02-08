package tut3;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter no to check :");
        int a = input.nextInt();
        int temp;
        temp = a;
        int sum = 0;
        while (true) {
            while (a > 0) {
                int rem = a % 10;
                int cube = rem * rem * rem;
                sum = sum + cube;
                a = a / 10;
            }
            if (sum == temp) {
                System.out.println("true");
            } else System.out.println("false");
        }
    }
}
