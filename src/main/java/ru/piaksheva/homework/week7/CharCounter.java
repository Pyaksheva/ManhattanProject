package ru.piaksheva.homework.week7;

import java.util.*;

public class CharCounter {
    public static void countChars(String s) {
        HashMap<Character, Integer> charCounts = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            if (charCounts.containsKey(c)) {
                charCounts.put(c, charCounts.get(c) + 1);
            } else {
                charCounts.put(c, 1);
            }
        }
        for (char c : charCounts.keySet()) {
            System.out.println(c + " - " + charCounts.get(c));
        }
    }

    public static void main(String[] args) {
        String s = "hello world";
        countChars(s);
    }
}
