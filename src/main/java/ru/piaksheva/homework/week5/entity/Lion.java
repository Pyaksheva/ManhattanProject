package ru.piaksheva.homework.week5.entity;

public class Lion extends AbstractAnimal {

    @Override
    void eat() {
        System.out.println("Я лев и я ем мясо");
    }

    @Override
    void play() {
        super.play();
        System.out.println("Я тигр и я могу играть только если меня дразнить");
    }
}
