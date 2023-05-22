package com.pack1;

public class SleepWaitDemo {

    public static void main(String[] args) {
        Object lock = new Object();

        // Sleep for 2 seconds
        try {
            System.out.println("Before sleep");
            Thread.sleep(2000);
            System.out.println("After sleep");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Wait for 2 seconds
        synchronized (lock) {
            try {
                System.out.println("Before wait");
                lock.wait(2000);
                System.out.println("After wait");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
