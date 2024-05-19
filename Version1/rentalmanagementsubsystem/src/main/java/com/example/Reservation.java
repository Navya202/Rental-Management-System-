package com.example;

import java.time.LocalDateTime;

public class Reservation {
    private int reservationId;
    private LocalDateTime reservationDate;
    private Customer customer;
    private Bike bike;
    private Staff staff;

    public Reservation(int reservationId, LocalDateTime reservationDate, Customer customer, Bike bike, Staff staff) {
        this.reservationId = reservationId;
        this.reservationDate = reservationDate;
        this.customer = customer;
        this.bike = bike;
        this.staff = staff;
    }

    public void makeReservation() {
        // Logic to make reservation
        if (bike.checkAvailability()) {
            bike.setAvailability(false);
            System.out.println("Reservation made for bike ID: " + bike.getBikeId() + " by customer ID: " + customer.getCustomerId());
        } else {
            System.out.println("Bike ID: " + bike.getBikeId() + " is not available for reservation.");
        }
    }

    public void cancelReservation() {
        // Logic to cancel reservation
        bike.setAvailability(true);
        System.out.println("Reservation cancelled for bike ID: " + bike.getBikeId() + " by customer ID: " + customer.getCustomerId());
    }

    // Getters and Setters
}

