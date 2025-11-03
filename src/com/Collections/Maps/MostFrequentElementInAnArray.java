package com.Collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElementInAnArray {

    public static void main(String[] args) {

        // Given an array, find the most frequent element in it. If there are
        // multiple elements that appear a maximum number of times, print any one of them.
        // n = 6 and arr[] = {1,3,2,1,4,1} => o/p = 1.

        int[] arr = {1,3,2,1,4,1};
        int n = arr.length;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            if (!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.put(i, map.get(i) + 1);
            }
        }

        System.out.println(map.entrySet());

        int maxFreq = 0; int ansKey = 0;

        for (var i : map.entrySet()) {
            if (i.getValue() > maxFreq){
                maxFreq = i.getValue();
                ansKey = i.getKey();
            }
        }

        System.out.println(ansKey);






    }
}
