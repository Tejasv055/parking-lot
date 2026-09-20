package org.example.parkingLot.strategy;

/**
 * Payment by the mode of Card.
 */
public class CardPayment implements PaymentStrategy {
    @Override
    public void pay(final double amount) {
        System.out.println("Paid ₹" + amount + " using card");
    }
}
