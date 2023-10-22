package ru.piaksheva.homework.week11;

public class PrintNums {
    public static void main(String[] args) throws InterruptedException {
        Runnable printNums = () -> {
            for (int i = 1; i < 11; i++) {
                System.out.println("Поток: " + Thread.currentThread() + "число: " + i);
            }
        };
        Thread myThread1 = new Thread(printNums);
        Thread myThread2 = new Thread(printNums);
        myThread1.start();
        myThread1.join();
        System.out.println("--------------------------------------");
        myThread2.start();
        myThread2.join();
    }
}
