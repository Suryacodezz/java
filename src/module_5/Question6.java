package module_5;

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class Mythread extends Thread {
    private Counter counter;

    Mythread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class Question6 {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Mythread t1 = new Mythread(counter);
        Mythread t2 = new Mythread(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.getCount());
    }
}
