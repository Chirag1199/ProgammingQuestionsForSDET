package main.oops.Abstraction;

public class Ferrari extends Car {

    public Ferrari() {

        this.car_name = "Ferrari F8";
        this.car_model = "Tributo";
        this.car_Riz_Year = 2022;
        this.car_Lic_ID = "MH12AB1234";
        this.topSpeed = 340;
        this.price = 35000000;
        this.efficiency = 6.5;

    }


    @Override
    public void showFerrariDetails(){

        System.out.println("Ferrari Name: " + car_name);
        System.out.println("Model: " + car_model);
        System.out.println("Year: " + car_Riz_Year);
        System.out.println("License ID: " + car_Lic_ID);
        System.out.println("Top Speed: " + topSpeed + " km/h");
        System.out.println("Price: ₹" + price);
        System.out.println("Efficiency: " + efficiency + " km/l");
    }

    @Override
    public void showAudiDetails(){
        System.out.println("Inheriting abstract audi details method from parent class in Ferrari class.");
    }
}
