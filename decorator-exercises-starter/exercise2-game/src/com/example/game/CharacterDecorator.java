package com.example.game;

public class CharacterDecorator implements Character {
    Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
    }

    public void move() {
        character.move();
    }

    public void attack() {
        character.attack();
    }

    public int getSpeed() {
        return character.getSpeed();
    }

    public int getDamage() {
        return character.getDamage();
    }

    public String getSprite() {
        return character.getSprite();
    }
}
