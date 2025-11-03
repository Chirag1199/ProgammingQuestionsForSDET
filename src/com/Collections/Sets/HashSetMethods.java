package com.Collections.Sets;

import java.util.HashSet;

public class HashSetMethods {

    public static void main(String[] args) {


        // Declaration:

        HashSet<String> hs = new HashSet<>();

        hs.add("Chirag");
        hs.add("Devayani");
        hs.add("Vikas");
        hs.add("Chirag");

        System.out.println(hs);

        System.out.println(hs.contains("Chirag"));

        System.out.println(hs.size());

        for (String s : hs){
            System.out.println(s);
        }
    }

}
