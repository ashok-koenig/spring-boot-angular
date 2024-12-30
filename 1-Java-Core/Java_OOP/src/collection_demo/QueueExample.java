package collection_demo;

import java.util.LinkedList;
import java.util.Stack;

public class QueueExample {
    public static void main(String[] args) {
        // FIFO - Queue
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");

        System.out.println("Tasks Queue: "+ tasks);

        // Process task
        while (!tasks.isEmpty()){
            System.out.println("Processing: "+ tasks.poll());
        }

        // LIFO - Stack
        Stack<String> stack = new Stack<>();
        stack.add("Method 1");
        stack.add("Method 2");
        stack.add("Method 3");

        System.out.println("Stack methods: "+ stack);

        // Execute Method
        while (!stack.isEmpty()){
            System.out.println("Executing: "+ stack.pop());
        }
    }
}
