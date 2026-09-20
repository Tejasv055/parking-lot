package org.example.parkingLot.strategy;

import org.example.parkingLot.model.Ticket;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Hourly pricing details for a vehicle.
 */
public class HourlyPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(final Ticket ticket) {
        final var entryTime = ticket.getTime();
        final var exitTime = LocalDateTime.now();

        var hours = Duration.between(entryTime, exitTime).toHours();

        hours = Math.max(hours, 1);

        return hours * 50;
    }
}
