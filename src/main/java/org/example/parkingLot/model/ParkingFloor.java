package org.example.parkingLot.model;

import java.util.List;

/**
 * The details about parking floor.
 */
public class ParkingFloor {
    /**
     * Floor number in the lot.
     */
    private final int floorNumber;

    /**
     * Types of spots available.
     */
    private final List<ParkingSpot> spots;

    /**
     * Details about parking floor.
     *
     * @param floorNumber The floor number
     * @param spots The type of spot.
     */
    public ParkingFloor(int floorNumber, List<ParkingSpot> spots) {
        this.floorNumber = floorNumber;
        this.spots = spots;
    }

    /**
     * Gets the floor number
     */
    public int getFloorNumber() {
        return floorNumber;
    }

    /**
     * Gets available spots.
     */
    public List<ParkingSpot> getSpots() {
        return spots;
    }
}
