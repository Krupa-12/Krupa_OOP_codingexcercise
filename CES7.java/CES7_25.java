class TablePrinter {

    public synchronized void printTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() +
                    " : " + number + " x " + i + " = " + (number * i));

            try {
                Thread.sleep(200); // small delay to clearly show ordering
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
        System.out.println();
    }
}

class TableThread extends Thread {
    private TablePrinter printer;
    private int number;

    public TableThread(TablePrinter printer, int number, String name) {
        super(name);
        this.printer = printer;
        this.number = number;
    }

    @Override
    public void run() {
        printer.printTable(number);
    }
}

public class Main {
    public static void main(String[] args) {

        TablePrinter printer = new TablePrinter();

        TableThread t1 = new TableThread(printer, 5, "Table-5 Thread");

        TableThread t2 = new TableThread(printer, 7, "Table-7 Thread");

        t1.start();
        t2.start();
    }
}
