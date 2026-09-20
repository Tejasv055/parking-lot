package org.example.parkingLot.strategy;

import org.example.parkingLot.model.Ticket;

/**
 * Pricing Strategy giving information regarding price.
 */
public interface PricingStrategy {
    /**
     * Calculates the price.
     *
     * @param ticket The ticket giving price details
     *
     * @return The price.
     */
    double calculatePrice(Ticket ticket);
}
