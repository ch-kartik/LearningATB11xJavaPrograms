package ex_32_Collection_Framework_DSA.LIST;

import java.util.Vector;
import java.util.ListIterator;

public class Lab248_Vector_ListIterator {
    public static void main(String[] args) {

        Vector<String> vector = new Vector();
        vector.add("Item 1");
        vector.add("Item 2");
        vector.add("Item 3");
        vector.add("Item 4");
        vector.add("Item 5");

        ListIterator listIterator = vector.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("\n------\n");

        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }
}
