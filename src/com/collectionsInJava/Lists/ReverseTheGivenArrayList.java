package com.collectionsInJava.Lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReverseTheGivenArrayList {

    static void reversedArrayList(ArrayList<Integer> arr){

        int i = 0;
        int j = arr.size() - 1;

        while(i < j){

            Integer temp = Integer.valueOf(arr.get(i));
            arr.set(i, arr.get(j));
            arr.set(j, temp);

            i++;
            j--;

        }

    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(4);
        arr.add(7);
        arr.add(0);

        System.out.println("Before reversing: " + arr);

        reversedArrayList(arr);

        System.out.println("After reversing: " + arr);


    }
}
