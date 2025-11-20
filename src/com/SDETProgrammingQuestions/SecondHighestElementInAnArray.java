package com.SDETProgrammingQuestions;

import java.util.Arrays;

public class SecondHighestElementInAnArray {

    public static void main(String[] args) {


        secondHighestElementInAnArray();


    }

    static void secondHighestElementInAnArray() {

        int[] arr = {3,1,2,5,4};
        int n = arr.length; // n = 5;


        for (int i = 0; i < n - 1; i++) {
            for (int  j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Second Highest Element is: " + arr[n - 2]);






    }
}
