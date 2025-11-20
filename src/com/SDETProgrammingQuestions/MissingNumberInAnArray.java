package com.SDETProgrammingQuestions;

public class MissingNumberInAnArray {

    public static void main(String[] args) {

        missingNumberInAnArray(new int[]{9,10,11,13,14});

     }

    static void missingNumberInAnArray(int arr[]) {

        // 1. Find the minimum and maximum values in the array. The minimum is the smallest number,
        // and the maximum is the largest number in the array.

        int n = arr.length;

        int max = arr[n-1]; // arr[3] = 8
        int min = arr[0]; // arr[0] = 4
        int expectedSum = 0;
        int actualSum = 0;
        int missingNumber;

        for (int i = 0; i < n; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > min) {
                max = arr[i];
            }

            // 2. Calculate the actual sum of all elements present in the array.
            actualSum += arr[i];

        }


        System.out.println(min);
        System.out.println(max);
        System.out.println(actualSum);

        // Calculate the expected sum of all numbers from the minimum to the maximum using the formula:
        // expected sum = (minimum + maximum) multiplied by (maximum − minimum + 1) divided by 2.

        expectedSum = (min + max) * (max - min + 1) / 2;
        System.out.println(expectedSum);

        // 4. Compute the missing number by subtracting the actual sum from the expected sum.
        missingNumber = expectedSum - actualSum;
        System.out.println("\nMissing Number in an array is:- " + missingNumber);





    }

}
