package org.fasttrackit;

public class JokerVehicle extends Vehicle {

    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println(getName() + " is accelerating with " + speed +
                "for "+ durationInHours+ "h");
        double distance = 2*speed*durationInHours;

        setTravelDistance(getTravelDistance()+distance);
        System.out.println("Cheating! ha ha..");
        return distance;
    }
}
