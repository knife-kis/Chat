package com.tarnovskiy;

/**
 * @author Tarnovskiy Maksim
 */
public class ABC {
    private volatile static char charA = 'A';

    public static void main(String[] args) {
        Object monitor = new Object();

        Thread a = new Thread(() -> {
            printABC(monitor, 'A', 'B');
        });
        Thread b = new Thread(() -> {
            printABC(monitor, 'B', 'C');
        });
        Thread c = new Thread(() -> {
            printABC(monitor, 'C', 'A');
        });

            a.start();
            b.start();
            c.start();
        try {
            a.join();
            b.join();
            c.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void printABC(Object mon, char letter1, char letter2) {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (charA != letter1) {
                        mon.wait();
                    }
                    System.out.print(charA);
                    charA = letter2;
                    mon.notifyAll();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
