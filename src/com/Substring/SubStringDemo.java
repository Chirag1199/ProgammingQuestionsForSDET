package com.Substring;

public class SubStringDemo {

    public static void main(String[] args) {

        String word = "abcabc";
        int n = word.length();

        for (int i = 0; i < n; i++) {

            String subStr = " ";

            for (int j = i; j < n; j++) {

                subStr += word.charAt(j);
                System.out.println(subStr);
            }

        }

    }

}
