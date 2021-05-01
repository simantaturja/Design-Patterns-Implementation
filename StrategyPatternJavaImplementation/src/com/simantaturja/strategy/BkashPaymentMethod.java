package com.simantaturja.strategy;

public class BkashPaymentMethod implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Pay with Bkash is successful");
    }
}