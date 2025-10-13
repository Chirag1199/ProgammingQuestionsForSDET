package com.SubString;

import java.util.ArrayList;

public class CountUniqueSubString {

    public static void main(String[] args) {

        String word = "abcabc";
        int n = word.length();

        ArrayList<String> subStrings = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String subStr = "";

            for (int j = i; j < n; j++) {

                subStr += word.charAt(j);
                subStrings.add(subStr);

            }

        }
        System.out.println(subStrings);
        System.out.println(subStrings.size());

        ArrayList<String> uniqueSubStings = new ArrayList<>();

        for (String i : subStrings) {

            if(!uniqueSubStings.contains(i)){

                uniqueSubStings.add(i);

            }

        }

        System.out.println(uniqueSubStings);
        System.out.println(uniqueSubStings.size());

        // Print the substrings whose count is upto 3

        System.out.println("\nUnique Substrings whose length is equal to 3: - ");
        for (String s : uniqueSubStings){

            if (s.length() == 3){
                System.out.println(s);
            }
        }

    }
}
