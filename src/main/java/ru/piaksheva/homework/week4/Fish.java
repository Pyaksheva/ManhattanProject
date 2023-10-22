package ru.piaksheva.homework.week4;

public class Fish implements Swimable {

    @Override
    public void swim() {
        fin();
        System.out.println("Я рыба и я плыву");
    }

    private void fin() {
        System.out.println("Я рыба и для того, чтобы плыть, у меня есть хвостовой плавник");
    }
}