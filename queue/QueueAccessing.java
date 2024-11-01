package com.codegym.queue;

// Java program to iterate elements to a Queue

import java.util.*;

public class QueueAccessing {

    public static void main(String args[]) {
        Queue<String> ticketsQueue = new PriorityQueue<>();
        ticketsQueue.add("Khang");
        ticketsQueue.add("Tan");
        ticketsQueue.add("Trung");
        System.out.println(ticketsQueue);

        Iterator iterator = ticketsQueue.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter name want to find: ");
//        String name = scanner.nextLine();
//
//        for (String item: ticketsQueue) {
//            if (item.equalsIgnoreCase(name)) {
//                System.out.println(item);
//                break;
//            }
//        }
        List<String> list = new ArrayList<>(ticketsQueue);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter position want to find: ");
        int position = scanner.nextInt();
        System.out.println(list.get(position));
    }
}
