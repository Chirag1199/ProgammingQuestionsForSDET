package com.Collections.Lists;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        // add new element:
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);

        // get an element at index i:
        System.out.println(arrayList.get(0));

        // print out using for loop:
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }

        // print the arrayList directly:-
        System.out.println(arrayList);

        // add an element at index i
        arrayList.add(1,100);
        System.out.println(arrayList);

        // modifying an element at index i:
        arrayList.set(1,10);
        System.out.println(arrayList);

        // removing an element at index i:
        arrayList.remove(0);
        System.out.println(arrayList);

        // removing an element e:
        arrayList.remove(Integer.valueOf(13));
        System.out.println(arrayList);

        // check if an element exists:
        boolean ifValueExists = arrayList.contains(Integer.valueOf(14));
        System.out.println(ifValueExists);


        // What if you dont define any wrapper class inside arrayList class:
        ArrayList arrayList1 = new ArrayList();

        // here u can add anything inside it:
        arrayList1.add("Chirag");;
        arrayList1.add(true);
        arrayList1.add(13);

        System.out.println(arrayList1);
    }

}
