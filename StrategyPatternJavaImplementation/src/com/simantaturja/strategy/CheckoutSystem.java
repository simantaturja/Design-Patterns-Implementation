package com.simantaturja.strategy;

public class CheckoutSystem {
    public static void main(String... args) {
        PaymentMethods paymentMethods = new PaymentMethods();
        int orderAmount = 500;
        String selectedMethod = "COD";
        if (selectedMethod.equals("Bkash")) {
            paymentMethods.setStrategy(new BkashPaymentMethod());
            paymentMethods.executeStrategy();
        } else if (orderAmount >= 500 && selectedMethod.equals("COD")) {
            paymentMethods.setStrategy(new CODPaymentMethod());
            paymentMethods.executeStrategy();
        } else {
            System.out.println("Sorry! Minimum 500tk order is required for cash on delivery");
        }
    }
}