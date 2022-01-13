package ayan;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch = input.nextLine().trim().charAt(0);
//        System.out.println(ch);

        if (ch >='a' && ch<='z'){
            System.out.println("Lowercase");
        }else {
            System.out.println("uppercase");
        }
    }
}
