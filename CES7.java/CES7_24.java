class NumberThread extends Thread {
    private int start;
    private int end;

    public NumberThread(String name, int start, int end) {
        super(name);
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(getName() + " prints: " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        NumberThread t1 = new NumberThread("T1", 1, 100);

        NumberThread t2 = new NumberThread("T2", 101, 200);

        NumberThread t3 = new NumberThread("T3", 201, 300);

        try {
            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
