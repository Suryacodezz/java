package module_5;

class LifeCycleDemo extends Thread {

    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) throws InterruptedException {

        LifeCycleDemo t = new LifeCycleDemo();

        System.out.println("State after creation: " + t.getState());

        t.start();
        System.out.println("State after start(): " + t.getState());

        Thread.sleep(100);
        System.out.println("State during sleep: " + t.getState());

        t.join();
        System.out.println("State after completion: " + t.getState());
    }
}
