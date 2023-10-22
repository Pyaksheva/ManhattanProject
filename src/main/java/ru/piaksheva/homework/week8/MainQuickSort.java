package ru.piaksheva.homework.week8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainQuickSort {
    public static void main(String[] args) {
        String[] arr = {"apple", "orange", "grape", "banana"};
        print(arr);
        System.out.println("-------------------");
        quickSort(arr, 0, arr.length - 1);
        print(arr);
    }

    public static void quickSort(String[] arr, int low, int high) {
        if (arr.length == 0 || low >= high) return;
        int middle = low + (high - low) / 2;
        String border = arr[middle];
        int i = low, j = high;
        while (i <= j) {
            while (arr[i].compareTo(border) < 0) {
                i++;
            }
            while (arr[j].compareTo(border) > 0) {
                j--;
            }
            if (i <= j) {
                String swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                i++;
                j--;
            }
        }

        //рекурсия для сортировки левой и правой части
        if (low < j) quickSort(arr, low, j);
        if (high > i) quickSort(arr, i, high);
    }

    public static void print(String[] arr) {
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
