package ru.piaksheva.homework.week8;

import java.util.function.Consumer;

public class WriterConsumer implements Consumer<String> {

    @Override
    public void accept(String string) {
        System.out.println(string);
    }
}
