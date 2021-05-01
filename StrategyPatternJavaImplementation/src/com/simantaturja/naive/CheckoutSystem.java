package com.simantaturja.naive;

public class CheckoutSystem {
    public static void main(String... args) {
        PaymentMethods paymentMethods = new PaymentMethods();
        int orderAmount = 200;
        String selectedMethod = "COD";
        if (selectedMethod.equals("Bkash")) {
            paymentMethods.setSelectedPaymentMethod("Bkash");
            paymentMethods.pay();
        }
		else if (orderAmount >= 500 && selectedMethod.equals("COD")) {
            paymentMethods.setSelectedPaymentMethod("COD");
            paymentMethods.pay();
        }
		else {
		    System.out.println("Sorry!!Minimum 500 tk. order is required for COD");
        }
    }
}
