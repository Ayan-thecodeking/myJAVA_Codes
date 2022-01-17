package tut3;

import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String Fruit = input.next();

//        switch (Fruit) {
//            case "mango" -> System.out.println("the king of fruits");
//            case "apple" -> System.out.println("a red fruit");
//            case "Banana" -> System.out.println("a calorie fruit");
//            case "guava" -> System.out.println("a green fruit ");
//            default -> System.out.println("envalid !! print any valid fruit name ");
//        }
//        nested switch
        int empID = input.nextInt();
        String department = input.next();

        switch (empID) {
            case 1 -> System.out.println("ayan gupta");
            case 2 -> System.out.println("learning java");
            case 3 -> {
                System.out.println("ask for department");
                switch (department) {
                    case "IT" -> System.out.println("it department");
                    case "cse" -> System.out.println("cse department");
                    default -> System.out.println("no departments");
                }
            }
            default -> System.out.println("again invalid");
        }


    }
}
