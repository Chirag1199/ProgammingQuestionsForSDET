package com.collectionsInJava.Maps;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        firstNonRepeatingChar();

    }

    static void firstNonRepeatingChar(){

        String str = "abacabad";
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

        System.out.println(map);

        for (int i = 0; i < c.length; i++) {
            if (map.get(c[i]) == 1) {
                System.out.println(c[i]);
                break;
            }
        }


    }


}
