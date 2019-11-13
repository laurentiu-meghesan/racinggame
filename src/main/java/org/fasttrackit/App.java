package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{

    // one line comment

    public static void main( String[] args )
    {
        System.out.println( "Welcome to the racing game" );

        Car carReference = new Car();
        carReference.name = "Dacia";
        carReference.color = "red";
        carReference.mileage = 9.80;
        carReference.fuelLevel = 60;
        carReference.maxSpeed = 200;
        carReference.running = false;
        carReference.doorCount = 2;

        Car car2 = new Car();
        car2.name = "BMW";
        car2.mileage = 14;
        car2.color = null;

        //concatenation
        System.out.println("First car name: " + carReference.name);
        System.out.println(carReference.color);
        System.out.println(carReference.mileage);
        System.out.println(carReference.fuelLevel);
        System.out.println(carReference.doorCount);
        System.out.println(carReference.maxSpeed);
        System.out.println(carReference.running);
        System.out.println(carReference.travelDistance);

        System.out.println("Second car name: " + car2.name);
        System.out.println(car2.color);
        System.out.println(car2.mileage);
        System.out.println(car2.fuelLevel);
        System.out.println(car2.doorCount);
        System.out.println(car2.maxSpeed);
        System.out.println(car2.running);
        System.out.println(car2.travelDistance);

        car2.name = "WV";
        System.out.println(car2.name);

        Car car3 = car2;
        car3.name = "Audi";

        System.out.println("Car2 name: " + car2.name);
        System.out.println("Car3 name: " + car3.name);

        Car car4 = null;
        System.out.println(car4.name);

    }
}
