package tut3;

import javax.xml.namespace.QName;

public class Stringex {
    public static void main(String[] args) {
//        String message =greet();
//        System.out.println(message);
        String realname = mygreet("ayan");
        System.out.println(realname);
    }

    static String mygreet(String name) {
        String message = "hello"  + name ;
        return message;

    }

    static String greet(){
        String name = "new jersey";
        return name ;
    }
}
