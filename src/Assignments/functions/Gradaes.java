package Assignments.functions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Gradaes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score");
        float sum = 0 , per ;

        int num = input.nextInt();
        for (int i = 1 ; i <= num ; i++){
            sum += input.nextInt();
        }
        System.out.println("total sum "+ sum);
        per = (sum/num*100)*100;
        String grade ;


        switch ((int)per/10) {
            case 9 :
                grade = "AA";
                break;
                case 8 :
                grade = "BB";
                break;
                case 7 :
                grade = "CC";
                break;
                case 6 :
                grade = "DD";
                break;
            default:
                grade = "fail";
        }
        System.out.println("your grade is " + grade );
    }}