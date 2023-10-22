package ru.piaksheva.homework.week4;

public class Ship implements Swimable {

    @Override
    public void swim() {
        propeller();
        System.out.println("Я корабль и я плыву");
    }

    private void propeller() {
        System.out.println("Я корабль и для того, чтобы плыть, у меня есть гребной винт");
    }
}
