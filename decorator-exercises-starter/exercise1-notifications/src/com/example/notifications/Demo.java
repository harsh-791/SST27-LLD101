package com.example.notifications;

/**
 * Starter demo that uses only the existing Email notifier.
 * TODOs guide you to add decorators and compose them.
 */
public class Demo {
    public static void main(String[] args) {

        // Baseline behavior (already works)
        Notifier base = new EmailNotifier("user@example.com");

        // Baseline (email only)
        base.notify("Baseline email only.");

        // a) Email + SMS
        Notifier smsAndEmail = new SmsDecorator(base, "+91-99999-11111");
        smsAndEmail.notify("Build green");

        // b) Email + WhatsApp
        Notifier emailAndWhatsApp = new WhatsAppDecorator(base, "user_wa");
        emailAndWhatsApp.notify("Your package shipped");

        // c) Email + Slack
        Notifier emailAndSlack = new SlackDecorator(base, "alerts");
        emailAndSlack.notify("High CPU usage detected");

        // d) Email + WhatsApp + Slack
        Notifier full = new SlackDecorator(
                new WhatsAppDecorator(base, "user_wa"),
                "deployments");
        full.notify("Deployment completed");
    }
}
