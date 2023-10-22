package ru.piaksheva.homework.week8;

import java.util.Arrays;

public class MainMergeSort {
    public static void main(String[] args) {
        String[] arr = {"cat", "orange", "elephant", "bird"};
        print(arr);
        System.out.println("------------------");
        String[] sorted = mergeSort(arr);
        print(sorted);
    }

    public static String[] mergeSort(String[] arr) {
        if (arr.length == 1) return arr;
        int middle = arr.length / 2;
        String[] first = mergeSort(Arrays.copyOfRange(arr, 0, middle));
        String[] second = mergeSort(Arrays.copyOfRange(arr, middle, arr.length));
        String[] result = new String[arr.length];

        int i1 = 0, i2 = 0, ir = 0;

        while (ir != arr.length) {
            if (i1 > first.length - 1) {
                result[ir] = second[i2];
                i2++;
            } else if (i2 > second.length - 1) {
                result[ir] = first[i1];
                i1++;
            } else if (first[i1].length() <= second[i2].length()) {
                result[ir] = first[i1];
                i1++;
            } else {
                result[ir] = second[i2];
                i2++;
            }
            ir++;
        }
        return result;
    }

    public static void print(String[] arr) {
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
