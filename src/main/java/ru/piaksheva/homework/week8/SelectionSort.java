package ru.piaksheva.homework.week8;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        String[] str = {"5+6+32=43", "1+1=2", "(3+5)*4*21=483", "((21-20)*(32-30))/2=1"};
        print(str);
        System.out.println("------------------");
        selectionSort(str);
        print(str);
    }

    public static void selectionSort(String [] arr) {
        for (int i = 0; i < arr.length; i++) {
            //pos - индекс наименьшего элемента
            int pos = i;
            //pos - наименьший элемент
            String min = arr[i];
            //цикл выбора наименьшего элемента
            for (int j = i + 1; j < arr.length; j++) {
                if (countOperations(arr[j]) < countOperations(min)) {
                    pos = j;
                    min = arr[j];
                }
            }
            //меняем местами наименьший с arr[i]
            arr[pos] = arr[i];
            arr[i] = min;
        }
    }

    public static int countOperations(String str){
        List<Character> signs = Arrays.asList('+', '-', '*', '/', '(');
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (signs.contains(ch)) {
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
