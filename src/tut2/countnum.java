package tut2;

import java.util.Scanner;

public class countnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 323832;
        int count=0;
        while(num>0){
            int rem = num%10;
            if (rem==3) {
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
