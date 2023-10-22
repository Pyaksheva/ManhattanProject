package ru.piaksheva.homework.week11;

import java.util.Scanner;

public class SumSquare {
    private static int sum = 0;
    private static Object monitor = new Object();
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Введите натуральное число: ");
        Scanner inputInt = new Scanner(System.in);
        int n = inputInt.nextInt();
        if (n == 1) {
            System.out.println(n);
            return;
        }
        if (n <= 0) {
            System.out.println("Ошибка. Введите натуральное число!");
            return;
        }

        Thread myThread1 = new Thread(new Summariser(1, n / 2));
        Thread myThread2 = new Thread(new Summariser(n / 2 + 1, n));
        myThread1.start();
        myThread2.start();
        myThread1.join();
        myThread2.join();
        System.out.println("Cумма квадратов первых N натуральных чисел: " + sum);
    }

    static class Summariser implements Runnable {
        int from;
        int to;

        public Summariser(int from, int to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public void run() {
            for (int i = from; i < to + 1; i++) {
                synchronized (monitor) {
                    sum = sum + (int) Math.pow(i, 2);
                }
            }
        }
    }

}
