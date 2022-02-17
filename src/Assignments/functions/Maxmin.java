package Assignments.functions;

import java.util.Scanner;

public class Maxmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        int largest = max(first , second , third);
        System.out.printf("largest of three numbers %d, %d, and %d is : %d %n", first, second, third, largest);

        int smallest = min(first , second , third);
        System.out.printf("smallest of three numbers %d, %d, and %d is : %d %n", first, second, third, smallest);
    }
     static int max(int first , int second , int third){
        int max = first;
        if (second>max){
            max=second;
        }
       if (third>max){
            max=third;
        }
       return max;
     }
     static int min(int first , int second , int third){
         int min = first;
         if (second< min){
             min =second;
         }
         if (third< min){
             min =third;
         }
         return min;
     }
}

