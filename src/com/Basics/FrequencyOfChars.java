package com.Basics;

public class FrequencyOfChars {

    public static void main(String[] args) {

        String name = "chirag kataria";
        char[] c = name.toCharArray();
        int n = c.length;
        String repeatedChars = "";

        for (int i = 0; i < n; i++) {

            if (c[i] == '0' || c[i] == ' ') {
                continue; // skip if already counted or space
            }

            int count = 1;

            for (int j = i + 1; j <= n - 1; j++) {

                if (c[i] == c[j]) {

                    count++;
                    c[j] = '0';

                }
            }


            if (count != 1){
                repeatedChars += c[i];
            }

            System.out.println("The char " + c[i] + " occurs " + count + " time(s)");

        }




    }

}

