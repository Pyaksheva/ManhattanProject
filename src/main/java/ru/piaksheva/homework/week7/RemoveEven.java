package ru.piaksheva.homework.week7;

import java.util.Arrays;
import java.util.LinkedList;

public class RemoveEven {
    public static LinkedList<Integer> removeEvenOnes(LinkedList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                nums.remove(i);
                i--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>(Arrays.asList(2, 8, 5, 3, 1, 9, 4));
        System.out.println(removeEvenOnes(nums));
    }
}
