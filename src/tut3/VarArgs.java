package tut3;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(3,4,24,2,5);
        multiple(4,5,"ayan","aksh", "sona ", " vaish");
    }
    static void multiple(int a , int b ,String ...V){
        System.out.println('a'+'b');
        System.out.println(Arrays.toString(V));
    }
    static void fun(int ...V){
        System.out.println(Arrays.toString(V));
    }
}
