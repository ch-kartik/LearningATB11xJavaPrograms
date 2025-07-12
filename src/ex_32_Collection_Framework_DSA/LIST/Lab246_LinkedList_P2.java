package ex_32_Collection_Framework_DSA.LIST;

import java.util.*;

public class Lab246_LinkedList_P2 {
    public static void main(String[] args) {
        List mylist = new ArrayList(5);
        List mylist0 = new ArrayList(); // Arrays Format - Continuous

        List myList2 = new LinkedList(); // Doubly Linked List

        myList2.add("Jack");
        myList2.add("Sparrow");
        myList2.add("Roxanne");
        myList2.add("Mahesh");
        myList2.add("Chottu");
        myList2.add("Chottu");
        myList2.add(null);
        myList2.add(true);
        myList2.add(123);
        System.out.println(myList2);

        System.out.println(myList2.isEmpty());
        System.out.println(myList2.size());
        System.out.println(myList2.contains("Roxanne"));
        System.out.println(myList2.indexOf("Roxanne"));

    }
}
