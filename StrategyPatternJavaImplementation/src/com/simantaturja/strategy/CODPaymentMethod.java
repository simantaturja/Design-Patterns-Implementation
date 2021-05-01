package com.simantaturja.strategy;

public class CODPaymentMethod implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Pay with COD is successful");
    }
}