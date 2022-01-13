package tut2;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        basic loop
        int salary = input.nextInt();
        if (salary>10000){
            System.out.println(salary+1000);
        }else{
            System.out.println(salary);
        }
    }
}
