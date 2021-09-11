package ru.mirea.homeworkOne;

import ru.mirea.homeworkOneClasses.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        //Testing Doges
        System.out.println("Testing Doge objects:");
        Doge d1 = new Doge("Sasha", 5);
        Doge d2 = new Doge("Alexander");
        d2.setAge(10);
        d1.setName("Alexandra");
        System.out.println(d1);
        System.out.println(d2);
        d1.intoHumanAge();
        d2.intoHumanAge();
        System.out.println();

        //Testing Balls
        System.out.println("Testing Ball objects:");
        Ball b1 = new Ball("Real Madrid", 95.4F);
        Ball b2 = new Ball();
        b2.setClub("Barcelona");
        b2.pumpTheBall(80.23F);
        b1.pumpOutTheBall(10);
        System.out.println(b1);
        System.out.println(b2);
        b1.kickStrength(57);
        b2.kickStrength(68);
        System.out.println();

        //Testing Books
        System.out.println("Testing Book objects:");
        Book bk1 = new Book("Wonderful Days", 450, 204);
        Book bk2 = new Book("Tractatus Logico-Philosophicus", 66);
        bk2.setBookmark(64);
        System.out.println(bk1);
        System.out.println(bk2);
        bk1.symbolsCount(12);
        bk2.symbolsCount(14);
    }
}
