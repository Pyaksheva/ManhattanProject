package ru.piaksheva.homework.week11;

public class EvenOdd {
    public static void main(String[] args) throws InterruptedException {
        Thread evenThread = new Thread(new EvenThread());
        Thread oddThread = new Thread(new OddThread());
        evenThread.start();
        evenThread.join();
        oddThread.start();
        oddThread.join();
    }

    static class EvenThread implements Runnable {
        @Override
        public void run() {
            System.out.println("Четные числа");
            for (int i = 0; i < 11; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }

        }
    }

    static class OddThread implements Runnable {
        @Override
        public void run() {
            System.out.println("Нечетные числа");
            for (int i = 0; i < 11; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }

        }
    }
}
