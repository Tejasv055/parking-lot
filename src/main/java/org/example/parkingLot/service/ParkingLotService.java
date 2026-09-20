package org.example.parkingLot.service;

import org.example.parkingLot.model.ParkingLot;
import org.example.parkingLot.model.Ticket;
import org.example.parkingLot.model.Vehicle;
import org.example.parkingLot.strategy.ParkingSpotStrategy;
import org.example.parkingLot.strategy.PricingStrategy;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Service managing business of parking in the lot
 */
public class ParkingLotService {

    private final ParkingLot parkingLot;

    private final ParkingSpotStrategy parkingSpotStrategy;

    private final PricingStrategy pricingStrategy;

    public ParkingLotService(final ParkingLot lot,
                             final ParkingSpotStrategy strategy
        , final PricingStrategy pricingStrategy) {
        this.parkingLot = lot;
        this.parkingSpotStrategy = strategy;
        this.pricingStrategy = pricingStrategy;

    }

    /**
     * Exits the vehicle.
     *
     * @param ticket Details about exiting vehicle
     *
     * @return The price to be paid.
     */
    public double exitVehicle(final Ticket ticket) {
        final var price = pricingStrategy.calculatePrice(ticket);

        ticket.getParkingSpot().removeVehicle();

        return price;
    }

    /**
     * Parks the vehicle.
     *
     * @param vehicle The vehicle to be parked.
     *
     * @return Ticket containing parking details.
     */
    public Ticket parkVehicle(final Vehicle vehicle) {
        final var spot = parkingSpotStrategy.findSpot(vehicle,
                                                      parkingLot.getFloors());

        if (spot == null) {
            throw new IllegalStateException("No suitable parking spot is available.");
        }
        spot.park(vehicle);

        return new Ticket(generateTicketId(),
                          vehicle,
                          spot,
                          LocalDateTime.now());
    }

    /**
     * Generated ticket id.
     */
    private String generateTicketId() {
        return UUID.randomUUID().toString();
    }

}
