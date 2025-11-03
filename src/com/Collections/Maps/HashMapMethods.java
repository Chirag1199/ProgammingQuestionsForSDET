package com.Collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods
{
    static void HashMapMethodsInJava(){

        // Syntax

        // Note: Map is an interface and objects are not created for interfaces. Objects are
        // always created for the class, which is HashMap in our example.

        Map<String, Integer> map = new HashMap<>();

        // Adding Elements:-

        map.put("Akash", 21);
        map.put("Devayani", 23);
        map.put("Chirag", 26);
        map.put("Vikas", 29);

        // Getting the value of a key from hashmap:

        System.out.println(map.get("Devayani"));
        System.out.println(map.get("Rahul"));

        // Changing/Updating the value of a key in hashmap:

        map.put("Vikas", 30);
        System.out.println(map.get("Vikas"));

        // Removing the pair from a hashmap:

        System.out.println(map.remove("Akash"));
        System.out.println(map.remove("Akshaya"));

        // To check if the key contains in the hashmap:

        System.out.println(map.containsKey("Akash"));
        System.out.println(map.containsKey("Devayani"));

        // Adding a new entry in the hashmap, only if key doesn't exists already:

        map.putIfAbsent("Chirag", 34); // false
        map.putIfAbsent("Grissna", 29); // true.

        // Get all the keys in the hashmap;

        System.out.println(map.values());

        // Get all entries from the hashmap:
        System.out.println(map.entrySet());

        // Traversing all entries from the hashmap - Multiple methods

        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.printf("Age of %s is %d\n", e.getKey(), e.getValue());
        }

        System.out.println();

        for(var e : map.entrySet()){
            System.out.printf("\nAge of " + e.getKey() + " is " + e.getValue());
        }

    }

    public static void main(String[] args) {

        HashMapMethodsInJava();

    }
}
