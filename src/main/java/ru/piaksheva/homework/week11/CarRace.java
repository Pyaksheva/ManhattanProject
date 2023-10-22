package ru.piaksheva.homework.week11;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class CarRace {
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Thread car1 = new Thread(new Race(cyclicBarrier, countDownLatch));
        Thread car2 = new Thread(new Race(cyclicBarrier, countDownLatch));
        car1.start();
        car2.start();
        countDownLatch.await();
        System.out.println("Гонка закончена!");
    }

    static class Race implements Runnable {
        CyclicBarrier cyclicBarrier;
        final CountDownLatch countDownLatch;

        public Race(CyclicBarrier cyclicBarrier, CountDownLatch countDownLatch) {
            this.cyclicBarrier = cyclicBarrier;
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            int s = 50;
            int distance = 0;
            while (distance < 50) {
                int v = (int) (Math.random() * 100) % 6;
                distance = distance + v;
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    System.out.println(e);
                }
                System.out.println("Поток " + Thread.currentThread() + " прошел " + distance);
            }
            System.out.println("Победил поток " + Thread.currentThread());
            countDownLatch.countDown();
        }
    }
}
