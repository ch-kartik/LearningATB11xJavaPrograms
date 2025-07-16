package ex_32_Collection_Framework_DSA.QUEUE;

import java.util.PriorityQueue;

public class Lab258_Queue {
    public static void main(String[] args) {
        // Queue -> 0.001% in Automation
        PriorityQueue pq = new PriorityQueue();
        pq.add("Jack");
        pq.add("Sparrow");
        // PQ -> Natural - Sorting
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
