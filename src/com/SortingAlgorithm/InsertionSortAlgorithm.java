package com.SortingAlgorithm;

import java.util.Arrays;

public class InsertionSortAlgorithm {

    static void main(String[] args) {
        int[] nums = {5, 3, 4, 1, 2};

        int[] result = insertionSort(nums);
        System.out.println(Arrays.toString(result));
    }

    static int[] insertionSort(int[] nums){

        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && key < nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }

        return nums;
    }
}
