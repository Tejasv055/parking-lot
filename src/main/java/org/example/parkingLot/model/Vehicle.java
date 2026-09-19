package org.example.parkingLot.model;

/**
 * The details of vehicle.
 */
public class Vehicle {
    /**
     * The license number of vehicle.
     */
    private final String licenseNumber;

    /**
     * The type of vehicle.
     */
    private final VehicleType type;

    /**
     * Initializing details of vehicle.
     *
     * @param licenseNumber The license number of vehicle.
     * @param type The type of vehicle.
     */
    public Vehicle(final String licenseNumber, final VehicleType type) {
        this.licenseNumber = licenseNumber;
        this.type = type;
    }

    /**
     * Gets license number of vehicle.
     *
     * @return The license number of vehicle.
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Gets the type of vehicle.
     *
     * @return The type of vehicle.
     */
    public VehicleType getType() {
        return type;
    }
}
