import java.util.Scanner;

class SharedBuffer {
    private int data;
    private boolean hasData = false;


    public synchronized void produce(int value) {
        try {
            while (hasData) {
                wait();

            }
            data = value;
            System.out.println("Produced: " + data);
            hasData = true;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public synchronized void consume() {
        try {
            while (!hasData) {
                wait();
            }
            System.out.println("Consumed: " + data);
            hasData = false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Producer extends Thread {
    private SharedBuffer buffer;
    private int n;

    public Producer(SharedBuffer buffer, int n) {
        this.buffer = buffer;
        this.n = n;
    }

    public void run() {
        for (int i = 1; i <= n; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Consumer extends Thread {
    private SharedBuffer buffer;
    private int n;

    public Consumer(SharedBuffer buffer, int n) {
        this.buffer = buffer;
        this.n = n;
    }

    public void run() {
        for (int i = 1; i <= n; i++) {
            buffer.consume();
            try {
                Thread.sleep(500); // delay for visibility
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class ProducerConsumerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        SharedBuffer buffer = new SharedBuffer();

        Producer p = new Producer(buffer, n);
        Consumer c = new Consumer(buffer, n);

        p.start();
        c.start();


        try {
            p.join();
            c.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Process Completed!");
    }
}