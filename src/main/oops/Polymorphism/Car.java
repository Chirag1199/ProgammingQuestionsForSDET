package main.oops.Polymorphism;

public class Car {

    String car_name;
    String car_model;
    int car_Riz_Year;
    String car_Lic_ID;
    int topSpeed;
    double price;
    double efficiency;

    public void displayDetails(){
        System.out.println("Name: " + car_name);
        System.out.println("Model: " + car_model);
        System.out.println("Year: " + car_Riz_Year);
        System.out.println("License ID: " + car_Lic_ID);
        System.out.println("Top Speed: " + topSpeed + " km/h");
        System.out.println("Price: ₹" + price);
        System.out.println("Efficiency: " + efficiency + " km/l");
    }

    // The same method has been defined in Ferrari Class.
    // So, the method with the same name has been overriden.

    public void showFerrariDetails(){
        System.out.println("Ferrari Details from Parent class. ");
    }

    public void showAudiDetails(){
        System.out.println("Audi Details from the parent class. ");
    }
}
