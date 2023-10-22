package ru.piaksheva.homework.week12;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("/Users/elena/IdeaProjects/Manhattan Project/.gitignore");
        List<String> strings = Files.readAllLines(file);//чтение всех строк из файла
        Files.write(file, "huita".getBytes(), StandardOpenOption.APPEND); //запись в файл в конец
        Files.write(file, "huita".getBytes()); //запись в файл с заменой
    }
}
