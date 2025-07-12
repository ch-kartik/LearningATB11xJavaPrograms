package ex_32_Collection_Framework_DSA.LIST;

import java.util.Stack;

public class Lab252_Stack {
    public static void main(String[] args) {
        // Stack
        // List In -> First Out ( LIFO)
//        Stack s = new Stack();
//        s.add("Jack");
//        s.add("Sparrow");
//        System.out.println(s);

        Stack s = new Stack();
        s.push("Jack");
        s.push("Sparrow");
        s.push("Peter");
        s.push("Parker");
        System.out.println(s);

        System.out.println(s.size());
        System.out.println(s.isEmpty());
        System.out.println(s.empty());
        System.out.println(s.add("Black Beard"));
        System.out.println(s);
        s.add("Chetan");
        s.add("Chetan");
        s.push("Vijay");
        System.out.println(s);
    }
}
