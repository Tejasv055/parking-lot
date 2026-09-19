package org.example.parkingLot.service;

import org.example.parkingLot.model.ParkingLot;
import org.example.parkingLot.model.ParkingSpot;
import org.example.parkingLot.model.Vehicle;
import org.example.parkingLot.strategy.ParkingSpotStrategy;

public class ParkingLotService {

    private final ParkingLot parkingLot;

    private final ParkingSpotStrategy parkingSpotStrategy;

    public ParkingLotService(final ParkingLot lot,
                             final ParkingSpotStrategy strategy) {
        this.parkingLot = lot;
        this.parkingSpotStrategy = strategy;

    }

    public ParkingSpot parkVehicle(final Vehicle vehicle) {
        final var spot = parkingSpotStrategy.findSpot(vehicle,
                                                      parkingLot.getFloors());

        if (spot == null) {
            throw new IllegalStateException("No suitable parking spot is available.");
        }
        spot.park(vehicle);

        return spot;
    }

}
