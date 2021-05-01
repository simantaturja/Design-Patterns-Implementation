package com.simantaturja.strategy;

// This is the context class
public class PaymentMethods {
    PaymentStrategy paymentStrategy;
    
    public void setStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void executeStrategy() {
        paymentStrategy.pay();
    }
}