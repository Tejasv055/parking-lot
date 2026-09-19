package org.example.parkingLot.model;

import java.util.List;

/**
 * The detail about parking lot.
 */
public class ParkingLot {
    /**
     * Total number of floors in the lot.
     */
    private final List<ParkingFloor> floors;

    /**
     * Initializing details about parking lot.
     *
     * @param floors the floors in parking lot.
     */
    public ParkingLot(final List<ParkingFloor> floors) {
        this.floors = floors;
    }

    /**
     * Gets parking lot.
     */
    public List<ParkingFloor> getFloors() {
        return floors;
    }
}
