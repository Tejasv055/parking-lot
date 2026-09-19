package org.example.parkingLot.strategy;

import org.example.parkingLot.model.ParkingFloor;
import org.example.parkingLot.model.ParkingSpot;
import org.example.parkingLot.model.Vehicle;

import java.util.List;

/**
 * The business details about finding spot in parking.
 */
public interface ParkingSpotStrategy {

    /**
     * To find the spot.
     *
     * @param vehicle The vehicle to park.
     * @param floors The floors of lot.
     *
     * @return The parking spot.
     */
    ParkingSpot findSpot(
        Vehicle vehicle,
        List<ParkingFloor> floors
                        );
}
