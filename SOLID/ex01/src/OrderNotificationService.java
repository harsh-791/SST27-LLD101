class OrderNotificationService {
    private final EmailService emailService;

    public OrderNotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void sendOrderConfirmation(Order order) {
        String message = "Thanks! Your total is " + order.getTotal();
        emailService.send(order.getCustomerEmail(), message);
    }
}