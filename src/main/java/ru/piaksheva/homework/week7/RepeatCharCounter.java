package ru.piaksheva.homework.week7;

import java.util.HashMap;

public class RepeatCharCounter {
    public static void main(String[] args) {
        String str = "hello world";
        HashMap<Character, Integer> charCounts = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (charCounts.get(ch) != null) {
                int countRepeat = charCounts.get(ch);
                charCounts.put(ch, countRepeat + 1);
            } else if (charCounts.get(ch) == null) {
                charCounts.put(ch, 1);
            }
        }
        for (char ch : charCounts.keySet()) {
            System.out.println(ch + " - " + charCounts.get(ch));
        }
    }
}

