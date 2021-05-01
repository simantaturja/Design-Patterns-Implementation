package com.simantaturja.naive;

public class PaymentMethods {
    private String selectedPaymentMethod;
    public void setSelectedPaymentMethod(String s) {
        this.selectedPaymentMethod = s;
    }
    public void pay() {
        switch (selectedPaymentMethod) {
            case "COD" -> payWithCOD();
            case "Bkash" -> payWithBkash();
            case "Nagad" -> payWithNagad();
            case "SureCash" -> payWithSureCash();
            case "Card" -> payWithCard();
            case "Rocket" -> payWithRocket();
        }
    }
    private void payWithCOD() {
        System.out.println("Pay with COD is successful");
    }
    private void payWithBkash() {
        System.out.println("Pay with Bkash is successful");
    }
    private void payWithNagad() {
        System.out.println("Pay with Nagad is Successful");
    }
    private void payWithCard() {
        System.out.println("Pay with Card is Successful");
    }
    private void payWithRocket() {
        System.out.println("Pay with Rocket is Successful");
    }
    private void payWithSureCash() {
        System.out.println("Pay with SureCash is Successful");
    }
}
