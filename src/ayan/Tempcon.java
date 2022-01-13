package ayan;

import java.util.Scanner;

public class Tempcon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        temperature convert celcius to frenhiet

        System.out.println("please enter the temp in celcious");
        int a = input.nextInt();
         int fren = a*9/5 + 32;
        System.out.println(fren);


    }
}
