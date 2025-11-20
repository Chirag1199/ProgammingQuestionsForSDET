package com.Substring;

import java.util.ArrayList;

public class OccurancesOfSubString {

    public static void main(String[] args) {

        // First Generate the substring.

        String word = "abracadabra";
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

        // traverse the array list and search for aa. if found, count the number of
        // particular substring present in an arrayList.

        int specificSubStringCount = 0;

        for (int i = 0; i < subStrings.size(); i++){
            String s = subStrings.get(i);

            if (s.equals("abra")){
                specificSubStringCount++;
            }
        }

        System.out.println("The number of occurance of a specific substring is: "
                + specificSubStringCount);


    }
}
