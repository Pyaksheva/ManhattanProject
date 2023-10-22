package ru.piaksheva.homework.week6;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        System.out.print("Введите целое число ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String result = n % 2 == 0 ? "Число n четное" : "Число n не четное";
        System.out.println(result);
    }
}

