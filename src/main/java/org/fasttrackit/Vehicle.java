package org.fasttrackit;

public class Vehicle {

//  class variable
    static int totalCount;

//  instance variable
    private String name;
    private String color;
    private double mileage;
    private double maxSpeed;
    private double fuelLevel;
    private double travelDistance;
    private boolean running;

    public Vehicle() {

        totalCount++;
    }

//    method overloading
    public double accelerate(double speed){

        return accelerate (speed, 1);
    }

    public double accelerate(double speed, double durationInHours) {
            double mileageMultiplier=1;

        System.out.println(name + " is accelerating with " + speed + "for "+ durationInHours+ "h");

        if (speed>maxSpeed) {

            System.out.println("Sorry. Maximum speed exceded.");
            return 0;
        }
            else if (speed==maxSpeed){
            System.out.println("Careful!Max speed reached.");
            }
            else {
                System.out.println("Valid speed entered.");
            }

        if (fuelLevel <= 0){
            System.out.println("You don't have enough fuel");
            return 0;
        }

        if (speed>120){
            System.out.println("Going fast... you'll use more fuel.");

//           increasing mileage multiplier with percentage of acceleration's speed
            mileageMultiplier=speed/100;

        }

//      local variable (declared inside method)
        double distance = speed*durationInHours;
        travelDistance = distance + travelDistance;
        //same result as the statement above
//        travelDistance+=distance;

        System.out.println("Total travel distance " + travelDistance);

        double usedFuelwithStandardMileage = distance*mileage/100;
        System.out.println("Used fuel with standard mileage " + usedFuelwithStandardMileage);

        double usedFuelWithCurrentMileage=usedFuelwithStandardMileage*mileageMultiplier;
        System.out.println("Used fuel with current mileage " + usedFuelWithCurrentMileage);

        fuelLevel -= usedFuelwithStandardMileage*mileageMultiplier;

        System.out.println("Remaining fuel level " + fuelLevel);

        return distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTravelDistance() {
        return travelDistance;
    }

    public void setTravelDistance(double travelDistance) {
        this.travelDistance = travelDistance;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
