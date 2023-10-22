package ru.piaksheva.homework.week11;

import java.util.concurrent.CountDownLatch;

public class Exercise5 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDown = new CountDownLatch(1);
        Thread myThread1 = new Thread(new MyThread1(countDown));
        Thread myThread2 = new Thread(new MyThread2(countDown));
        myThread1.start();
        myThread2.start();
        myThread1.join();
    }

    static class MyThread1 implements Runnable {
        CountDownLatch countDown;

        public MyThread1(CountDownLatch countDown) {
            this.countDown = countDown;
        }

        @Override
        public void run() {
            try {
                countDown.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Exercise5.print();
        }
    }
    static class MyThread2 implements Runnable {
        CountDownLatch countDown;

        public MyThread2(CountDownLatch countDown) {
            this.countDown = countDown;
        }

        @Override
        public void run() {
            Exercise5.print();
                countDown.countDown();
        }
    }


    static void print() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
