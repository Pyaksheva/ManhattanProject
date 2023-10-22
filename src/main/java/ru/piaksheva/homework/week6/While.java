package ru.piaksheva.homework.week6;

public class While {
    public static void main(String[] args) {
        int i = 1;

        while (i < 513) {
            System.out.print(i + " ");
            i = i * 2;
        }

        System.out.println();

        int n = 1;
        do {
            System.out.print(n + " ");
            n = n * 2;
        } while (n < 513);
    }
}
