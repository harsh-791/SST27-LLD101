package com.example.game;

public class GoldenAura extends CharacterDecorator {
    public GoldenAura(Character wrappee) {
        super(wrappee);
    }

    @Override
    public void move() {
        System.out.println("[Golden Aura ✨] Moving with aura sprite " + getSprite() + " at speed " + getSpeed());
    }

    @Override
    public void attack() {
        System.out.println("[Golden Aura ✨] Attacking with aura sprite " + getSprite() + " at damage " + getDamage());
    }

    @Override
    public int getSpeed() {
        return super.getSpeed() + 2; 
    }

    @Override
    public int getDamage() {
        return super.getDamage() + 5;
    }

    @Override
    public String getSprite() {
        return "golden_" + super.getSprite();
    }
}
