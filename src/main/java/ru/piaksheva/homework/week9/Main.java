package ru.piaksheva.homework.week9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("cow", 1));
        animals.add(new Animal("pig", 2));
        animals.add(new Animal("cat", 3));
        animals.add(new Animal("dog", 4));
        animals.add(new Animal("duck", 5));
        animals.add(new Animal("tiger", 6));
        animals.add(new Animal("zebra", 7));
        animals.add(new Animal("elephant", 8));
        animals.add(new Animal("hippo", 9));
        animals.add(new Animal("horse", 10));

//        animals.stream()
//                .filter(animal -> animal.getName().equals("lion"))
//                .findAny()
//                .ifPresentOrElse(animal -> System.out.println(animal.getAge()), () -> {
//                    throw new IllegalArgumentException();
//                });

//        animals.stream()
//                .sorted(Comparator.comparing(animal -> animal.getAge()))
//                .forEach(animal -> System.out.println(animal));

//        long count = animals.stream()
//                .filter(animal -> animal.getAge() > 4)
//                .count();
//        System.out.println(count);

//        Map<String, Animal> animalMap =animals.stream()
//                .collect(Collectors.toMap(animal -> animal.getName(), animal -> animal));
//        System.out.println(animalMap);

        String str = animals.stream()
                .map(animal -> animal.getName())
                .reduce("", (prev,next) -> prev + " " + next);
        System.out.println(str);
    }
}
