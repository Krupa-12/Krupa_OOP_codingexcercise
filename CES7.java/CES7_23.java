class NumberThread extends Thread {
    private int start;
    private int end;
    private int delay;

    public NumberThread(int start, int end, int delay) {
        this.start = start;
        this.end = end;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + " prints: " + i);

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        NumberThread t1 = new NumberThread(1, 10, 1000);
        t1.setName("Thread-1");

        NumberThread t2 = new NumberThread(11, 20, 500);
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }
}
