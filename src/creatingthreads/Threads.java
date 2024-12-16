package creatingthreads;

// driver program to create threads
public class Threads {

    // main method - jvm calls this method in main thread
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        System.out.println("my thread has started");

        RunnableThread runnableThread = new RunnableThread();
        Thread t2 = new Thread(runnableThread);
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
    }
}
