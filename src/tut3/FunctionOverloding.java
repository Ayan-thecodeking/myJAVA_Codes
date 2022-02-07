package tut3;

public class FunctionOverloding {
    public static void main(String[] args) {
//        fun(33);
//        fun("ayan");
        int ans  = sum(33,27);
        System.out.println(ans);
    }
    static int sum(int a ,int b){
        return a+b;
    }
    static void fun(int a){
        System.out.println(a);

    }
    static void fun(String a){
        System.out.println(a);
    }

}
