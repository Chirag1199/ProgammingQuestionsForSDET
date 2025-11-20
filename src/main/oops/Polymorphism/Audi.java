package main.oops.Polymorphism;


public class Audi extends Car {

    public Audi() {
        this.car_name = "Audi Q7";
        this.car_model = "Technology";
        this.car_Riz_Year = 2024;
        this.car_Lic_ID = "MH14EF9012";
        this.topSpeed = 240;
        this.price = 8500000;
        this.efficiency = 11.5;
    }

    @Override
    public void showAudiDetails() {
        System.out.println("Audi Name: " + car_name);
        System.out.println("Model: " + car_model);
        System.out.println("Year: " + car_Riz_Year);
        System.out.println("License ID: " + car_Lic_ID);
        System.out.println("Top Speed: " + topSpeed + " km/h");
        System.out.println("Price: ₹" + price);
        System.out.println("Efficiency: " + efficiency + " km/l");
    }

}

