package tut2;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while (true) {

            System.out.println("Enter an operand :");
            char ch = input.next().trim().charAt(0);

            if (ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%'){
                System.out.println("Enter any two number  :");
                int num1=input.nextInt();
                int num2=input.nextInt();

                if (ch=='+'){
                    ans = num1 + num2;
                }if (ch=='-'){
                    ans = num1 - num2;
                }if(ch=='*'){
                    ans = num1 * num2;
                }if(ch=='/'){
                    if (num2!=0) {
                        ans = num1 / num2;
                    }
                }if(ch=='%'){
                    ans = num1 % num2;
                }

                System.out.println(ans);
            }
            else if (ch == 'X' || ch=='x'){
                break;
            }
            else {
                System.out.println("inavlid");
            }
        }

    }
}
