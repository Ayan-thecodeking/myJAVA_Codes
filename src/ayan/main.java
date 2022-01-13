package ayan;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*
syntax of if statements :
if(boolean expresssion T or F ){
//body
}else {
// do this
}
*/


     int salary = input.nextInt();
    /*

//        if (salary > 10000) {
//            salary = salary + 2000;
//        } else {
//            salary = salary + 1000;
//        }
//        System.out.println(salary);
*/


        // multiple if else

        if (salary > 10000){
            salary+=2000;
        }
        else if (salary > 20000){
            salary+=3000;

        }
        else {
            salary+=1000;
        }
        System.out.println(salary);
    }
}
