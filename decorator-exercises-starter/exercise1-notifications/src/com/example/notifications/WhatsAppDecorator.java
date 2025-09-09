package com.example.notifications;

public class WhatsAppDecorator extends NotifierDecorator {
    private final String userId;

    public WhatsAppDecorator(Notifier wrapper, String userId) {
        super(wrapper);
        this.userId = userId;
    }

    @Override
    public void notify(String text) {
        super.notify(text);
        System.out.println("[WhatsApp -> " + userId + "]: " + text);
    }
}
