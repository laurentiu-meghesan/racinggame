package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Track[] tracks = new Track[3];
    private List<Vehicle> competitors = new ArrayList<>();


    public void start() throws Exception {
        System.out.println("Starting game...");

        initializeTracks();
        displayTracks();

        Track selectedTrack = getSelectedTrackFromUser();
        initializeCompetitors();

        // enhanced for
        for (Vehicle vehicle : competitors) {
            System.out.println("It`s " + vehicle.getName() + "`s turn.");
            double speed = getAccelerationSpeedFromUser();

            vehicle.accelerate(speed);

            if (vehicle.getTravelDistance() >= selectedTrack.getLength()) {
                System.out.println("The winner is " + vehicle.getName() + "!");
                break;
            }
        }
    }

    private double getAccelerationSpeedFromUser() {
        System.out.println("Please enter acceleration speed.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private Track getSelectedTrackFromUser() throws Exception {
        System.out.println("Please select the circuit.");
        Scanner scanner = new Scanner(System.in);

        try {
            int selectedTrackNumber = scanner.nextInt();

            Track selectedTrack = tracks[selectedTrackNumber - 1];

            System.out.println("Selected track is " + selectedTrack.getName());
            return selectedTrack;
        } catch (InputMismatchException e) {
            throw new RuntimeException("You have entered an invalid value.");
        }catch (ArrayIndexOutOfBoundsException e){
            throw new Exception("You have selected non existing track.");
        }
    }

    private void initializeCompetitors() {

        int playerCount = getPlayerCountFromUser();
        System.out.println("Number of players " + playerCount);

        for (int i = 1; i <= playerCount; i++) {
            System.out.println("Adding player " + i);

            Vehicle vehicle = new Vehicle();
            vehicle.setName(getVehicleNameFromUser());
            vehicle.setFuelLevel(80);
            vehicle.setMileage(ThreadLocalRandom.current().nextDouble(6, 15));
            vehicle.setMaxSpeed(300);

            System.out.println("Vehicle for player " + i + ": " + vehicle.getName() + " - Mileage: " +
                    vehicle.getMileage());

            competitors.add(vehicle);
        }
    }

    private void initializeTracks() {
        Track track1 = new Track();
        track1.setName("Silverstone");
        track1.setLength(4.2);

        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Transylvania");
        track2.setLength(400.2);

        tracks[1] = track2;
    }

    private void displayTracks() {
        System.out.println("Available tracks: ");

//      classic for loop
        for (int i = 0; i < tracks.length; i++) {

            if (tracks[i] != null) {
                System.out.println((i + 1) + ". " + tracks[i].getName() + " - " + tracks[i].getLength() + "km");
            }
        }
    }

    private String getVehicleNameFromUser() {
        System.out.println("Please enter a vehicle name");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private int getPlayerCountFromUser() {

        System.out.println("Please enter the number of players: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();

    }

}

