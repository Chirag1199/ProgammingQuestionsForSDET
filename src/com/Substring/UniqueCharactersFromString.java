package com.Substring;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharactersFromString {

    public static void main(String[] args) {

        uniqueChars("aabbcdacdb");

        uniqueCharsUsingSetMethod("aabbcdacdb");



    }

    static void uniqueChars(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (result.indexOf(ch) == -1) {
                result += ch;
            }


        }

        System.out.println("Without Using Set method: " + result);
    }

    static void uniqueCharsUsingSetMethod(String str){

        Set<Character> set = new HashSet<Character>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!set.contains(ch)) {
                set.add(ch);
            }
        }

        System.out.println("Using Set: " + set);
    }

}
