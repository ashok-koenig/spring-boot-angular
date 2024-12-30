package multithreading_demo;

// Thread creation by extending Thread class
class Task1 extends Thread{
    public void run(){
        System.out.println("Task1 thread is running...");
    }
}

// Thread creation by implementing Runnable interface
class Task2 implements Runnable{
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(threadName+" thread is running...");
    }
}

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Process");

        Thread task2 = new Thread(new Task2());
        task2.setPriority(1);
        task2.setName("Task 2");
        task2.start();

        Task1 task1 = new Task1();
        task1.setPriority(10);
        task1.start();

        task1.join();
        task2.join();

        System.out.println("The End");
    }
}
