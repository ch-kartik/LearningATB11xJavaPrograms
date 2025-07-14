package ex_32_Collection_Framework_DSA.SET;

import java.util.*;

public class Lab255_HS_LHS_TS {
    public static void main(String[] args) {

        Set<String> hs = new HashSet();
        // Hashing mechanism to store the element
        // no order.
        // no duplicates

        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Watermelon");
        //hs.add(123);
        hs.add(null);
        // hs.add(null);    // only one null is accepted
        System.out.println(hs);
        System.out.println("-----------------------");

        for(String s : hs){
            System.out.println(s);
        }

        System.out.println("-----------------------");

        // Iterator
        Iterator iterator = hs.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-----------------------");

        Set lhs = new LinkedHashSet();
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates

        lhs.add("Dpple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add("Watermelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        System.out.println("-----------------------");

        Set ts = new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // order will maintain, Natural Sorting is done.
        // Natural Sorting - ASCII values.

        ts.add("Dapple");
        ts.add("Apple");
        ts.add("apple");
        ts.add("Orange");
        ts.add("Watermelon");
        //ts.add("");
        //ts.add(123);  // java.lang.ClassCastException
        //ts.add(null);   // java.lang.NullPointerException
        System.out.println(ts);

        System.out.println("----- For Each -----");

        for(Object o : ts){
            System.out.println(o);
        }
    }
}
