public class Demo01 {
    public static void main(String[] args) {
        EmailService emailService = new EmailClient();
        TaxCalculator taxCalculator = new StandardTaxCalculator(0.18);
        OrderNotificationService notificationService = new OrderNotificationService(emailService);
        OrderService orderService = new OrderService(taxCalculator, notificationService);

        orderService.checkout("a@shop.com", 100.0);
    }
}
