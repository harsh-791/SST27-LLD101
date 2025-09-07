package com.example.render;

public class App {
    public static void main(String[] args) {
        Renderer r = new Renderer();
        System.out.println("Cost=" + r.render("Hello Flyweight! ".repeat(2000)));

        // Test reference equality for same style configs
        TextStyle style1 = TextStyleFactory.getTextStyle("Inter", 14, true);
        TextStyle style2 = TextStyleFactory.getTextStyle("Inter", 14, true);
        System.out.println("Same style reference equality: " + (style1 == style2));

        TextStyle style3 = TextStyleFactory.getTextStyle("Inter", 14, false);
        System.out.println("Different style reference equality: " + (style1 == style3));
    }
}
