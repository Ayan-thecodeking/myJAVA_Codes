package Assignments.functions;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int ans = fact(num);
        System.out.println(ans);

    }
    static int fact(int n){
        if (n==0){
            return 1;

        }else
            return n*fact(n-1);

    }
}
