package ru.mirea.Practice3;

import pr3classes.*;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.5, "RED", false); // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        System.out.println(c1);
        System.out.println();

        Rectangle r1 = new Rectangle(10.4, 15.3, "PURPLE", true); // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        System.out.println();

        Square s4 = new Square(6.6, "Purple", true); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(s4.getSide());
    }
}
