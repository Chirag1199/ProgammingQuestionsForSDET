package main.oops.Polymorphism;


public class Main {

    static void main() {

        Car ferrariCar = new Ferrari(); // Parent's reference, Ferrari's Object.
        ferrariCar.showFerrariDetails(); // Calls Ferrari's overridden method.

        Car audiCar = new Audi();
        audiCar.showAudiDetails(); // calls Audi's overridden method


    }
}
