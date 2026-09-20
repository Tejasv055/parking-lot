package org.example;

import org.example.parkingLot.model.*;
import org.example.parkingLot.service.ParkingLotService;
import org.example.parkingLot.strategy.CashPayment;
import org.example.parkingLot.strategy.FirstAvailableStrategy;
import org.example.parkingLot.strategy.HourlyPricingStrategy;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Create parking spots
        ParkingSpot bikeSpot = new ParkingSpot(1, SpotType.BIKE);
        ParkingSpot carSpot = new ParkingSpot(2, SpotType.CAR);
        ParkingSpot truckSpot = new ParkingSpot(3, SpotType.TRUCK);

        // Create floor
        ParkingFloor floor = new ParkingFloor(
            1,
            List.of(bikeSpot, carSpot, truckSpot)
        );

        // Create parking lot
        ParkingLot parkingLot = new ParkingLot(
            List.of(floor)
        );

        // Create vehicle
        Vehicle vehicle = new Vehicle(
            "DL01AB1234",
            VehicleType.CAR
        );

        // Create service with strategies
        ParkingLotService service = new ParkingLotService(
            parkingLot,
            new FirstAvailableStrategy(),
            new HourlyPricingStrategy(),
            new CashPayment()
        );

        // Vehicle enters
        Ticket ticket = service.parkVehicle(vehicle);

        System.out.println("Ticket: " + ticket.getTicketId());
        System.out.println("Spot: " + ticket.getParkingSpot().getId());

        // Vehicle exits
        double amount = service.exitVehicle(ticket);

        System.out.println("Final amount: ₹" + amount);
    }
}
