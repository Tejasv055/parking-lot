package org.example.parkingLot.model;

/**
 * The parking spot of the parking lot.
 */
public class ParkingSpot {
    /**
     * The id for the spot.
     */
    private final int id;

    /**
     * The type of spot that is car, bike etc.
     */
    private final SpotType type;

    /**
     * The information of vehicle parked on the spot.
     */
    private Vehicle vehicle;

    /**
     * Initial information of the parking spot.
     *
     * @param id The id of the spot.
     * @param type The type of spot.
     */
    public ParkingSpot(final int id, SpotType type) {
        this.id = id;
        this.type = type;
    }

    /**
     * To check whether spot is free or not.
     *
     * @return Whether spot is free or not.
     */
    public boolean isFree() {
        return vehicle == null;
    }

    /**
     * The vehicle parked on the spot.
     *
     * @param vehicle The information about vehicle.
     */
    public void park(Vehicle vehicle) {
        if (!isFree()) {
            throw new IllegalStateException("Parking spot is already occupied");
        }

        this.vehicle = vehicle;
    }

    /**
     * Changes when spot becomes empty.
     */
    public void removeVehicle() {
        this.vehicle = null;
    }

    /**
     * The id of the spot.
     */
    public int getId() {
        return id;
    }

    /**
     * The type of spot
     */
    public SpotType getType() {
        return type;
    }
    /**
     * The vehicle parked.
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * To check vehicle fit in the spot.
     *
     * @param vehicle The vehicle to fit.
     *
     * @return heck whether vehicle is fit.
     */
    public boolean canFitVehicle(final Vehicle vehicle) {
        return vehicle.getType().name().equals(this.type.name());
    }
}
