package ru.piaksheva.homework.week11;

public class ThreadsExample {

    static class LeftRunnable implements Runnable {

        private final Object monitor;

        LeftRunnable(Object monitor) {
            this.monitor = monitor;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (monitor) {
                    try {
                        Thread.sleep(1000);
                        System.out.println("Шаг левой ногой");
                        monitor.notify();
                        monitor.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    static class RightThread extends Thread {

        private final Object monitor;

        RightThread(Object monitor) {
            this.monitor = monitor;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (monitor) {
                    try {
                        Thread.sleep(1000);
                        System.out.println("Шаг правой ногой");
                        monitor.notify();
                        monitor.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        }
    }

    public static void main(String[] args) {
        Object monitor = new Object();

        new RightThread(monitor).start();
        new Thread(new LeftRunnable(monitor)).start();
    }
}
