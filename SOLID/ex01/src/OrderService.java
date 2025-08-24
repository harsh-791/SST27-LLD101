public class OrderService {
    private final TaxCalculator taxCalculator;
    private final OrderNotificationService notificationService;

    public OrderService(TaxCalculator taxCalculator,OrderNotificationService notificationService) {
        this.taxCalculator = taxCalculator;
        this.notificationService = notificationService;
    }

    public void checkout(String customerEmail, double subtotal) {
        double total = taxCalculator.calculateTotalwithTax(subtotal);
        Order order = new Order(customerEmail, subtotal, total);

        notificationService.sendOrderConfirmation(order);
    }
}