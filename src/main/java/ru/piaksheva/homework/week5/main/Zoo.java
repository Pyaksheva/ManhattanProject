package ru.piaksheva.homework.week5.main;

import ru.piaksheva.homework.week5.entity.Lion;
import ru.piaksheva.homework.week5.entity.Monkey;
import ru.piaksheva.homework.week5.entity.Python;
import ru.piaksheva.homework.week5.entity.Zookeeper;

public class Zoo {
    public static void main(String[] args) {

        Monkey monkey = new Monkey();
        Lion lion = new Lion();
        Python python = new Python();

        Zookeeper zookeeper = new Zookeeper();

        zookeeper.makeEat(monkey);
        zookeeper.makePlay(monkey);

        zookeeper.makeEat(lion);
        zookeeper.makePlay(lion);

        zookeeper.makeEat(python);
        zookeeper.makePlay(python);
    }
}
