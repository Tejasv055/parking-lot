package org.example.parkingLot.model;

import java.time.LocalDateTime;

/**
 * Information about the ticket.
 */
public class Ticket {
    /**
     * The detail of ticket.
     */
    private final String ticketId;

    /**
     * The vehicle whose ticket is this.
     */
    private final Vehicle vehicle;

    /**
     * The parking spot of the vehicle.
     */
    private final ParkingSpot parkingSpot;

    /**
     * Time of entry on the ticket.
     */
    private final LocalDateTime time;

    /**
     * Initializes the ticket when vehicle is parked.
     *
     * @param ticketId The unique identifier of the ticket.
     * @param vehicle The vehicle to be parked.
     * @param parkingSpot The spot for parking.
     * @param localDateTime The time of parking.
     */
    public Ticket(final String ticketId,
                  final Vehicle vehicle,
                  final ParkingSpot parkingSpot,
                  final LocalDateTime localDateTime) {
        this.ticketId = ticketId;
        this.parkingSpot = parkingSpot;
        this.time = localDateTime;
        this.vehicle = vehicle;
    }

    /**
     * Gets ticket details.
     */
    public String getTicketId() {
        return ticketId;
    }

    /**
     * Gets the vehicle details to be parked.
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Gets the parking spot.
     */
    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    /**
     * Gets the time of parking.
     */
    public LocalDateTime getTime() {
        return time;
    }
}
