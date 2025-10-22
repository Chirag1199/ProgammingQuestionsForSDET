package com.collectionsInJava.Sets;

import java.util.HashSet;

public class LongestConsecutiveElementSequence {

    public static void main(String[] args) {

        int[] nums = {9,1,4,7,3,-1,0,5,8,-1,6};
        int longest_streak = 0;

        // 1. Convert it into a hashSet method.

        HashSet<Integer> hs =  new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            hs.add(nums[i]);
        }

        for (int num : hs){
            if (!hs.contains(num-1)){
               int current_num = num;
               int current_streak = 1;

               while(hs.contains(current_num + 1)){
                   current_streak++;
                   current_num++;

               }

                longest_streak = Math.max(longest_streak, current_streak);
            }


        }

        System.out.println(longest_streak);





    }


}
