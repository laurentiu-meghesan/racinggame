package org.fasttrackit;

public class Vehicle {

    String name;
    String color;
    double mileage;
    double maxSpeed;
    double fuelLevel;
    double travelDistance;
    boolean running;

    public double accelerate(double speed, double durationInHours)
    {

        System.out.println(name + "is accelerating with " + speed + "for "+ durationInHours+ "h");

//        local variable (declared inside method)
        double distance = speed*durationInHours;
        travelDistance = distance + travelDistance;
        //same result as the statement above
//        travelDistance+=distance;

        System.out.println("Total travel distance " + travelDistance);

        double usedFuel = distance*mileage/100;

        System.out.println("Used fuel " + usedFuel);

        fuelLevel -= usedFuel;

        System.out.println("Remaining fuel level " + fuelLevel);

        return distance;

    }

}
