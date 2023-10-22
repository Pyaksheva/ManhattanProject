package ru.piaksheva.homework.week5.entity;

public class Python extends AbstractAnimal {

    @Override
    void eat() {
        System.out.println("Я питон и я ем грызунов");
    }

    @Override
    void play() {
        System.out.println("Я питон и я не играю");
    }
}
