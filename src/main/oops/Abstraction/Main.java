package main.oops.Abstraction;


public class Main {

    static void main() {

        Car ferrariCar = new Ferrari(); // Parent's reference, Ferrari's Object.
        ferrariCar.showFerrariDetails(); // Calls Ferrari's overridden method.
        ferrariCar.showAudiDetails();

        Car audiCar = new Audi();
        audiCar.showAudiDetails();
        audiCar.showFerrariDetails();

        /**
         *
         * The compiler won’t let you instantiate an abstract class.
         *
         * An abstract class means that nobody can ever make a new
         * instance of that class.
         *
         * You can still use that abstract class as a declared reference type,
         * for the purpose of polymorphism, but you don’t have to worry about
         * somebody making objects of that type. The compiler guarantees it.
         */

        //  car = new Car();



    }
}
