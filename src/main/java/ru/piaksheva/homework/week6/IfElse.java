package ru.piaksheva.homework.week6;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.print("Введите температуру целым числом ");
        Scanner temperature = new Scanner(System.in);
        int i = temperature.nextInt();
        if (i < 0) {
            System.out.println("Сейчас очень холодно");
        } else if (i >= 0 && i < 16) {
            System.out.println("Сейчас прохладно");
        } else {
            System.out.println("Отличный летний денек!");
        }
        }
    }

