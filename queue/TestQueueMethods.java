package com.codegym.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueueMethods {

    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();

        // Adds elements {0, 1, 2, 3, 4} to
        // the queue
        for (int i = 0; i < 5; i++) q.add(i);

        // Display contents of the queue.
        System.out.println("Elements of queue: " + q);

        // To remove the head of queue.
        int removedElement = q.remove();
        System.out.println("removed element: " + removedElement);

        System.out.println(q);

        // To remove the head of queue.
        int removedElement2 = q.remove();
        System.out.println("removed element: " + removedElement2);

        System.out.println(q);

        // To view the head of queue
        int head = q.peek();
        System.out.println("head of queue: " + head);

        // Rest all methods of collection
        // interface like size and contains
        // can be used with this
        // implementation.
        int size = q.size();
        System.out.println("Size of queue: " + size);

        int test = q.element();
        System.out.println(test);
        System.out.println(q);

        int test2 = q.poll();
        System.out.println(test2);
        System.out.println(q);

        boolean test3 = q.offer(5);
        System.out.println(test3);
        System.out.println(q);
    }
}
