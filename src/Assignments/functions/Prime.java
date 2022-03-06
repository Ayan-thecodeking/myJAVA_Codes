package Assignments.functions;


import java.util.Scanner;

public class Prime {

    // Method 1
    // To test number is even or odd
    public static boolean main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean isprime = true;
        for (int i = 2 ; i<num;i++){
            if (num%i==0){
                return false;
            }
        }
        if (isprime){
        System.out.println("prime");
    }else {
        System.out.println("not prime");
    }
        return isprime;
    }
}
