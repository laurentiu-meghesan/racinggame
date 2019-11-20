package org.fasttrackit;

public class Mechanic {

    public void repairVehicle(Vehicle vehicle){

        System.out.println("Repairing vehicle"+ vehicle.name);
        vehicle.travelDistance = 0;

    }


}
