package com.aurionpro.day14.test;

import java.util.LinkedList;
import java.util.Queue;

public class DequeuePOC {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        
        enqueue(queue, "Gaurav");
        enqueue(queue, "Billionaire");
        enqueue(queue, "Millionaire");

       
        dequeue(queue);
        dequeue(queue);

       
        System.out.println("Queue after dequeueing:");
        System.out.println(queue);
    }

    private static void enqueue(Queue<String> queue, String element) {
        queue.add(element);
        System.out.println(element + " added to the queue.");
    }

    private static void dequeue(Queue<String> queue) {
        if (!queue.isEmpty()) {
            String removedElement = queue.poll();
            System.out.println(removedElement + " removed from the queue.");
        }
    }
}

