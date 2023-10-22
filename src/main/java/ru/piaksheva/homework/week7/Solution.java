package ru.piaksheva.homework.week7;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4};
        int[] expectedNums = {0, 1, 2, 3, 4, 0, 0, 0, 0, 0, 0};
        int[] result = removeDuplicates(nums);

        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.equals(result, expectedNums));

    }

    public static int[] removeDuplicates(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        int index = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i >= 1 && nums[i] != nums[i - 1]) {
                arr[index] = nums[i];
                index = index + 1;
            }
        }
        return arr;
    }
}

