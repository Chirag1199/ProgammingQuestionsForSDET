package com.SDETProgrammingQuestions;

public class ReverseIntegerNumber {

    public static void main(String[] args) {

        int result = reverse(1534236469);
        System.out.println(result);

    }

    static int reverse(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10;

            // check for overflow before multiplying
            if (reversedNumber > Integer.MAX_VALUE / 10 ||
                    (reversedNumber == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0;  // overflow
            }

            if (reversedNumber < Integer.MIN_VALUE / 10 ||
                    (reversedNumber == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0;  // overflow
            }

            reversedNumber = reversedNumber * 10 + lastDigit;
            number = number / 10;
        }

        return reversedNumber;
    }
}
