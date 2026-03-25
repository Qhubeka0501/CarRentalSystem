package za.ac.cput.repository;

import za.ac.cput.domain.Payment;
import java.util.*;
import java.util.HashMap;

public class PaymentRepository {
    private Map<String, Payment> paymentMap;

    // Constructor
    public PaymentRepository() {
        this.paymentMap = new HashMap<>();
    }

    // CREATE / SAVE
    public Payment save(Payment payment) {
        paymentMap.put(payment.getPaymentId(), payment);
        return payment;
    }

    // READ (find by ID)
    public Payment findById(String paymentId) {
        return paymentMap.get(paymentId);
    }

    // READ ALL
    public List<Payment> getAll() {
        return new ArrayList<>(paymentMap.values());
    }

    // DELETE
    public boolean delete(String paymentId) {
        return paymentMap.remove(paymentId) != null;
    }
}
