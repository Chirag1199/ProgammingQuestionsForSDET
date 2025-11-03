package com.Substring;

public class UniqueCharactersFromString {

    public static void main(String[] args) {

        String arr = "abbacdaab";

        String result = "";

        for (int i = 0; i < arr.length(); i++) {

            char ch = arr.charAt(i);

            if (result.indexOf(ch) == -1) {
                result += ch;
            }


        }

        System.out.println(result);

    }

}
