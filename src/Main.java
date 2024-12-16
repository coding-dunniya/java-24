// main class
public class Main {

    // main method - jvm calls this method
    public static void main(String[] args) throws InterruptedException {
        // some important thread class methods
        // first method is sleep.
        // sleep method sleeps the current thread for specified no of milliseconds
        Thread.sleep(10000);

        // get instance of current thread
        Thread main = Thread.currentThread();
        // get the name of thread
        String threadName = main.getName();
        System.out.println("Initial thread name ==> " + threadName);

        // set new name of thread
        main.setName("ritesh ka thread");
        String newThreadName = main.getName();
        System.out.println("New thread name ==> " + newThreadName);
    }
}





