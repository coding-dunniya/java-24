package synchronization;

// the counter class
public class Counter {

    // the initial count value
    private int count = 0;

    // lock object
    // it acts as a monitor and any thread must get access to this monitor
    // before entering the synchronized block below
    private final Object lock = new Object();

    // increments the value of count by 1
    public void increment() {
        synchronized (lock) {
            count = count + 1;
        }
    }

    // get the value of current count
    public int getCountValue() {
        return this.count;
    }
}
