package main.oops.Inheritance;

import java.net.StandardSocketOptions;
import java.sql.SQLOutput;

public class Cars {

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


}
