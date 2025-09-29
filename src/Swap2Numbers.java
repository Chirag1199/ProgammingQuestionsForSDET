public class Swap2Numbers {

    public static void main(String[] args) {

        swappingWithTemp(20,30);

        swappingWithoutTemp(10,12);

        swappingNumbersUsingXOR(5,4);

    }

    static void swappingWithTemp(int a, int b){

        int temp;

        if (a == b){
            System.out.println("Both values are same. No Swap needed! ");
        }

        else {
            temp = b;
            b = a;
            a = temp;

            System.out.println("Using temp variable, The value of a is : " + a + " and b is : " + b);
        }

    }

    static void swappingWithoutTemp(int a, int b) {

        a = a + b; // 10 + 12 = 22
        b = a - b; // 22 - 12 = 10 -> b swapped
        a = a - b; // 22 - 10 = 12 -> a swapped

        System.out.println("Without using temp variable, the value of a is : " + a + " and b is : " + b);

    }

    static void swappingNumbersUsingXOR(int a, int b){

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Using XOR Operation, " + a + " " + b);


    }
}
