package main.oops.Inheritance;

public class BMW extends Cars {

    public BMW(){

        this.car_name = "BMW X5";
        this.car_model = "M Sport";
        this.car_Riz_Year = 2023;
        this.car_Lic_ID = "MH01CD5678";
        this.topSpeed = 250;
        this.price = 9500000;
        this.efficiency = 12.0;

    }

    public void showBMWFeature(){
        System.out.println("BMW Name: " + car_name);
        System.out.println("Model: " + car_model);
        System.out.println("Year: " + car_Riz_Year);
        System.out.println("License ID: " + car_Lic_ID);
        System.out.println("Top Speed: " + topSpeed + " km/h");
        System.out.println("Price: ₹" + price);
        System.out.println("Efficiency: " + efficiency + " km/l");

    }

}

