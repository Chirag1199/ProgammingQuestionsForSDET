package com.Collections.Maps;

import java.util.*;

public class MostFrequentElementInString {

    static void repeatedCharInString(String str) {

        char[] c = str.toCharArray();
        int n = c.length;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0;  i < n; i++) {

            char ch = c[i];
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch, map.get(ch) + 1);
            }
        }

        System.out.println(map.entrySet());

        // {a=3, B=1, n=2} --> Collections []

        int maxFreq = 0; char repeatedChar = 0;

        for( var v : map.entrySet())
        {
            if(v.getValue() > maxFreq){

                maxFreq =  v.getValue();
                repeatedChar = v.getKey();
            }
        }

        System.out.println(repeatedChar);

    }

    public static void main(String[] args) {


        repeatedCharInString("xYYZZZZ");

    }

}
