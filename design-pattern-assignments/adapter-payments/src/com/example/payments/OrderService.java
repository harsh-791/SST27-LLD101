package com.example.payments;

import java.util.Map;
import java.util.Objects;

public class OrderService {
    private final Map<String, PaymentGateway> gateways;

    public OrderService(Map<String, PaymentGateway> gateways) {
        this.gateways = Objects.requireNonNull(gateways, "gateways");
    }

    // Smell: still switches; your refactor should remove this by ensuring map
    // contains adapters.
    public String charge(String customerId, int amountCents) {
        PaymentGateway gw = gateways.values().iterator().next();
        return gw.charge(customerId, amountCents);
    }
}
