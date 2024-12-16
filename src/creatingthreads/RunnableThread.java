package creatingthreads;

// each object of this class is an individual unit of work.
// we need to pass this object in Thread class constructor to create a new thread
// we are implementing Runnable interface here
public class RunnableThread implements Runnable {

    // entry point of thread
    @Override
    public void run() {
        System.out.println("inside runnable thread");
        Thread t1 = Thread.currentThread();
        String name = t1.getName();
        System.out.println("runnable thread name ==> " + name);
    }
}
