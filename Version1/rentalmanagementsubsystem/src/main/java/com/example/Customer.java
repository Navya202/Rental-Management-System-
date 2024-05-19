package com.example;

public class Customer {
    private int customerId;
    private String name;
    private String email;
    private String phone;
    private Account account;

    public Customer(int customerId, String name, String email, String phone, Account account) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.account = account;
    }

    public void manageAccount() {
        account.manageAccount();
    }

    public void makePayment(Payment payment) {
        payment.processPayment();
    }

    public int getCustomerId() {
        return customerId;
    }

    // Other getters and setters
}


