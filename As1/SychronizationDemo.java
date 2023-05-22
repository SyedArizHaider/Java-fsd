package com.pack1;

public class SychronizationDemo {

    public static void main(String[] args) {
        SharedObject sharedObject = new SharedObject();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                sharedObject.doSomething();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                sharedObject.doSomething();
            }
        });

        thread1.start();
        thread2.start();
    }

    static class SharedObject {
        private int counter = 0;

        public synchronized void doSomething() {
            for (int i = 0; i < 5; i++) {
                counter++;
                System.out.println(Thread.currentThread().getName() + ": " + counter);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
