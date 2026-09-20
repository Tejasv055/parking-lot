package org.example.parkingLot.strategy;

/**
 * Payment by cash.
 */
public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(final double amount) {
        System.out.println("Paid ₹" + amount + " using cash");

    }
}
