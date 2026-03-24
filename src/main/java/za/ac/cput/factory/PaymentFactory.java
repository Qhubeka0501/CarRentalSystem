package za.ac.cput.factory;

import za.ac.cput.domain.Payment;

public class PaymentFactory {
    public static Payment createPayment(String paymentId, double amount, String paymentMethod, String paymentDate) {

        return new Payment.Builder()
                .setPaymentId(paymentId)
                .setAmount(amount)
                .setPaymentMethod(paymentMethod)
                .setPaymentDate(paymentDate)
                .build();
    }
}
