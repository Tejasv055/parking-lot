package org.example.parkingLot.strategy;

import org.example.parkingLot.model.*;

import java.util.List;

public class FirstAvailableStrategy implements ParkingSpotStrategy {
    @Override
    public ParkingSpot findSpot(final Vehicle vehicle, final List<ParkingFloor> floors) {

        for (final var floor : floors) {
            for (final var spot : floor.getSpots()) {
                if (spot.isFree()
                    && spot.canFitVehicle(vehicle)) {
                    return spot;
                }
            }
        }

        return null;
    }
}
