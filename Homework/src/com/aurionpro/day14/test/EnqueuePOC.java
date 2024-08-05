package com.aurionpro.day14.test;

import java.util.LinkedList;
import java.util.Queue;

public class EnqueuePOC {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        
        enqueue(queue, "Gaurav");
        enqueue(queue, "Billionaire");
        enqueue(queue, "Millionaire");

        System.out.println("Queue after enqueueing:");
        System.out.println(queue);
    }

    private static void enqueue(Queue<String> queue, String element) {
        queue.add(element);
        System.out.println("'" + element + "' added to the queue.");
    }
}

