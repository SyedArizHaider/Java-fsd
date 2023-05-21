package com.pack1;

public class ThreadDemo {
    public static void main(String[] args) {
        // Create a thread by extending the Thread class
        Thread thread1 = new MyThread();
        thread1.start();

        // Create a thread by implementing the Runnable interface
        Runnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }

    // A class that extends the Thread class
    static class MyThread extends Thread {
        public void run() {
            System.out.println("Hello from MyThread!");
        }
    }

    // A class that implements the Runnable interface
    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("Hello from MyRunnable!");
        }
    }

}
