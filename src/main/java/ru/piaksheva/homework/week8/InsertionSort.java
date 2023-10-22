package ru.piaksheva.homework.week8;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class InsertionSort {
    public static void main(String[] args) {
        String[] str = {"cat", "orange", "elephant", "bird"};
        print(str);
        System.out.println("------------------");
        insertionSort(str);
        print(str);
    }

    public static void insertionSort(String[] arr) {
        int j;
        //сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
        for (int i = 1; i < arr.length; i++) {
            //сохраняем ссылку на индекс предыдущего элемента
            String swap = arr[i];
            for (j = i; j > 0 && countVowels(swap) < countVowels(arr[j - 1]); j--) {
                //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                arr[j] = arr[j - 1];
            }
            arr[j] = swap;
        }
    }

    public static int countVowels(String str) {
        List<Character> vowels = Arrays.asList('a', 'i', 'e', 'o', 'u', 'y');
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (vowels.contains(ch)) {
                count++;
            }
        }
        return count;
    }

    public static void print(String[] arr) {
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
