package ru.piaksheva.homework.week6;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner inputInt = new Scanner(System.in);
        int n = inputInt.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println("Факториал n = " + result);
    }
}
