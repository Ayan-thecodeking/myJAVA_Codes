package Assignments.Common;

public class LCM {
    public static void main(String[] args) {
        int n1 = 72 , n2=120;
        for(int i = 1; i <= n1; ++i) {
            // Checks if i is factor of both integers
            if(n1 % i == 0 && n2 % i == 0)
            System.out.println(i);
        }

    }
}
