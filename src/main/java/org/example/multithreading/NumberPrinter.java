package org.example.multithreading;

public class NumberPrinter {
    private static final Object lock = new Object();
    private static int currentNumber = 1;
    private static final int MAX_NUMBER = 15;
    private static final int NUM_THREADS = 3;

    public static void main(String[] args) {
        for (int i = 0; i < NUM_THREADS; i++) {
            int threadNumber = i + 1;
            Thread thread = new Thread(() -> printNumbers(threadNumber));
            thread.start();
        }
    }

    private static void printNumbers(int threadNumber) {
        synchronized (lock) {
            while (currentNumber <= MAX_NUMBER) {
                // Wait for our turn
                while (currentNumber % NUM_THREADS != threadNumber - 1 && currentNumber <= MAX_NUMBER) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }

                if (currentNumber <= MAX_NUMBER) {
                    System.out.println("Thread " + threadNumber + ": " + currentNumber);
                    currentNumber++;
                    // Notify all threads waiting on lock
                    lock.notifyAll();
                }
            }
        }
    }
}
