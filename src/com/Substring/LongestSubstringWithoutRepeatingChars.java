package com.Substring;

import java.util.ArrayList;

public class LongestSubstringWithoutRepeatingChars {
    public static void main(String[] args) {
        String word = "pwwkew";
        int n = word.length();
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String uniqueSubString = "";
            for (int j = i; j < n; j++) {
                if (uniqueSubString.indexOf(word.charAt(j)) == -1) {
                    uniqueSubString += word.charAt(j);
                } else {
                    break;
                }
            }
            arr.add(uniqueSubString);
        }
        System.out.println(arr);
        int max_length = 0;
        String longest_streak = "";
        for (int i = 0; i < arr.size(); i++) {
            String s = arr.get(i);
            if (s.length() > max_length) {
                max_length = s.length();
            }
        }
        System.out.println(max_length); // this gives us the max length as 3.

        for (int i = 0; i < arr.size(); i++){
            String s = arr.get(i);
            if (s.length() == max_length){
                System.out.println(s);
                break;
            }

        }
    }
}
