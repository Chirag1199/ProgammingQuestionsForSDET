public class ReverseIntegerNumber {

    public static void main(String[] args) {


        int number = 1534236469;
        int reversedNumber = 0;
        int lastDigit;

        // while loop keeps running unless number becomes 0.

        while (number != 0){

            lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number = number / 10;

        }

        System.out.println(reversedNumber);

    }

}
