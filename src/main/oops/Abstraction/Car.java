package main.oops.Abstraction;

/*
* If you declare an abstract method, you MUST
mark the class abstract as well. You can’t have
an abstract method in a non-abstract class.
* */
public abstract class Car {

    String car_name;
    String car_model;
    int car_Riz_Year;
    String car_Lic_ID;
    int topSpeed;
    double price;
    double efficiency;

    // In Abstraction, non-abstract methods are called Concrete methods.
    public void displayDetails() {
        System.out.println("Name: " + car_name);
        System.out.println("Model: " + car_model);
        System.out.println("Year: " + car_Riz_Year);
        System.out.println("License ID: " + car_Lic_ID);
        System.out.println("Top Speed: " + topSpeed + " km/h");
        System.out.println("Price: ₹" + price);
        System.out.println("Efficiency: " + efficiency + " km/l");
    }

    /*
    * Besides classes, you can mark methods abstract, too. An abstract
      class means the class must be extended; an abstract method means
      the method must be overridden.
    * */

    /*
    * you’ve already decided there isn’t any code that would make
    * sense in the abstract method, you won’t put in a method body.
    * */

    public abstract void showFerrariDetails();

    public abstract void showAudiDetails();
}
