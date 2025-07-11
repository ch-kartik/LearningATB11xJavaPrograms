package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab241_LIST_I {
    public static void main(String[] args) {

        //List fruits = new List();
        List fruits = List.of("Orange", "Apple", "Banana", "Mango", "Watermelon");
        System.out.println(fruits);
//        fruits.add("Grapes");   // java.lang.UnsupportedOperationException
//        fruits.remove("Banana");    // Not possible
//        System.out.println(fruits);

        List l = new ArrayList();   // Dynamic Dispatch
        ArrayList l2 = new ArrayList();
        l.add("hello");
        l.add(123);
        l.add(true);
        l.add("Blah Blah");
        System.out.println(l);
    }
}
