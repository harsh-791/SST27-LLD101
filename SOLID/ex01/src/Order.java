public class Order {
    private final String customerEmail;
    private final double subtotal;
    private final double total;

    public Order(String customerEmail, double subtotal, double total) {
        this.customerEmail = customerEmail;
        this.subtotal = subtotal;
        this.total = total;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTotal() {
        return total;
    }
}
