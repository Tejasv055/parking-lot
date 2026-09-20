package org.example.parkingLot.strategy;

/**
 * Payment Strategy to pay the amount..
 */
public interface PaymentStrategy {
    /**
     * Payment of the amount.
     *
     * @param amount The amount to be paid.
     *
     * @return The price.
     */
    void pay(double amount);
}
