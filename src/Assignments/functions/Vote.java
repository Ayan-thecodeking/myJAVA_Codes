package Assignments.functions;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        int res= check(age);
        System.out.println(res);
    }
  static int check(int age) {
      if (age >= 18) {
          System.out.println("eligible");
      } else {
          System.out.println("not eligible");
      }
      return 0;

  }


}
