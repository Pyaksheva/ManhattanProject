package ru.piaksheva.homework.week7;

import java.util.Stack;

public class Brackets {
    public static boolean isValid(String s) {
        Stack<Character> openBrackets = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                openBrackets.push(ch);
            } else {
                if (openBrackets.isEmpty()) {
                    return false;
                }
                Character openBracket = openBrackets.pop();
                if (openBracket != '(' && ch == ')') {
                    return false;
                } else if (openBracket != '[' && ch == ']') {
                    return false;
                } else if (openBracket != '{' && ch == '}') {
                    return false;
                }
            }
        }
        return openBrackets.isEmpty();
    }

    public static void main(String[] args) {
        String bracket1 = "()";
        String bracket2 = "()[]{}";
        String bracket3 = "(]";
        String bracket4 = "([)]";
        System.out.println(isValid(bracket1));
        System.out.println(isValid(bracket2));
        System.out.println(isValid(bracket3));
        System.out.println(isValid(bracket4));
    }
}

