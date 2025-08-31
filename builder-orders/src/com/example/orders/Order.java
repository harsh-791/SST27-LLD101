package com.example.orders;

import java.util.ArrayList;
import java.util.List;

/**
 * Telescoping constructors + setters. Allows invalid states.
 */
public final class Order {
    private final String id;
    private final String email;
    private final List<OrderLine> lines = new ArrayList<>();
    private final Integer discountPercent; // 0..100 expected, but not enforced
    private boolean expedited;
    private String notes;

    private Order(Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.lines.addAll(builder.lines);
        this.discountPercent = builder.discountPercent;
        this.expedited = builder.expedited;
        this.notes = builder.notes;
    }

    // public void addLine(OrderLine line) { lines.add(line); }
    // public void setDiscountPercent(Integer discountPercent) {
    // this.discountPercent = discountPercent; }
    // public void setExpedited(boolean expedited) { this.expedited = expedited; }
    // public void setNotes(String notes) { this.notes = notes; }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public List<OrderLine> getLines() {
        List<OrderLine> lines = new ArrayList<>();
        for (OrderLine l : this.lines)
            lines.add(l);
        return lines;
    } // leaks internal list

    public Integer getDiscountPercent() {
        return discountPercent;
    }

    public boolean isExpedited() {
        return expedited;
    }

    public String getNotes() {
        return notes;
    }

    public int totalBeforeDiscount() {
        int sum = 0;
        for (OrderLine l : lines)
            sum += l.getQuantity() * l.getUnitPriceCents();
        return sum;
    }

    public int totalAfterDiscount() {
        int base = totalBeforeDiscount();
        if (discountPercent == null)
            return base;
        return base - (base * discountPercent / 100);
    }

    public static class Builder {
        private String id;
        private String email;
        private List<OrderLine> lines = new ArrayList<>();
        private Integer discountPercent;
        private boolean expedited;
        private String notes;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setLine(OrderLine line) {
            this.lines.add(new OrderLine(line.getSku(), line.getQuantity(), line.getUnitPriceCents()));
            return this;
        }

        public Builder setAllLines(List<OrderLine> lines) {
            for (OrderLine l : lines) {
                this.lines.add(new OrderLine(l.getSku(), l.getQuantity(), l.getUnitPriceCents()));
            }
            return this;
        }

        public Builder setDiscountPercent(Integer discountPercent) {
            this.discountPercent = discountPercent;
            return this;
        }

        public Builder setExpedited(boolean expedited) {
            this.expedited = expedited;
            return this;
        }

        public Builder setNotes(String notes) {
            this.notes = notes;
            return this;
        }

        public Order build() {
            return new Order(this);
        }

    }

}
