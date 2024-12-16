package creatingthreads;

// each object of this class is an individual unit of work
// known as a thread
// We are extending Thread class here
public class MyThread extends Thread {

    // entry point of thread
    @Override
    public void run() {
        System.out.println("inside my thread");
        Thread t1 = Thread.currentThread();
        String name = t1.getName();
        System.out.println("my thread name ==> " + name);
    }
}
