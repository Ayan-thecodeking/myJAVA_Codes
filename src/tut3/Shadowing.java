package tut3;

public class Shadowing {
    static int a =44;
    public static void main(String[] args) {
        System.out.println(a);
        fun();
        int a=77;
        System.out.println(a);
    }
    static void fun(){

        System.out.println(a);
    }
}
