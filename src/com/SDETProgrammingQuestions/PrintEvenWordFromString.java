package com.SDETProgrammingQuestions;

import java.util.Arrays;

public class PrintEvenWordFromString {
    public static void main(String[] args) {


        String str = "Sky is blue and vast";
        String evenWords = "";

        String[] data = str.split(" ");

        System.out.println(Arrays.toString(data));

        int dataLength = data.length;

        for (int i = 0; i < dataLength; i++) {

            String word = data[i];
            if (word.length() % 2 == 0) {
                evenWords += word + " ";

            }

        }

        System.out.println(evenWords);

    }
}
