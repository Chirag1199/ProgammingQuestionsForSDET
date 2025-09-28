public class Swap2Numbers {

    public static void main(String[] args) {

        int a = 10;
        int b = 10;
        int temp;

        if (a == b){
            System.out.println("Both values are same. No Swap needed! ");
        }

        else {
            temp = b;
            b = a;
            a = temp;

            System.out.println("After Swapping: ");
            System.out.println("The value of a is : " + a + " and b is : " + b);
        }

    }
}
