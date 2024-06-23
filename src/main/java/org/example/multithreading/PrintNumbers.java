package org.example.multithreading;

public class PrintNumbers {
    private static final Object lock = new Object();
    private static int number = 1;
    private static final int MAX_COUNT = 15;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        synchronized (lock) {
                            while (number % 2 != 1 && number <= MAX_COUNT) {
                                lock.wait();
                            }
                            if (number > MAX_COUNT) {
                                break;
                            }
                            System.out.println(Thread.currentThread().getName() + ": " + number++);
                            lock.notify();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Thread-1");

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        synchronized (lock) {
                            while (number % 2 != 0 && number <= MAX_COUNT) {
                                lock.wait();
                            }
                            if (number > MAX_COUNT) {
                                break;
                            }
                            System.out.println(Thread.currentThread().getName() + ": " + number++);
                            lock.notify();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Thread-2");

        thread1.start();
        thread2.start();
    }
}
