package com.example.notifications;

public class SmsDecorator extends NotifierDecorator {
    private final String phoneNumber;

    public SmsDecorator(Notifier wrapper, String phoneNumber) {
        super(wrapper);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(String text) {
        super.notify(text);
        System.out.println("[SMS -> " + phoneNumber + "]: " + text);
    }
}
