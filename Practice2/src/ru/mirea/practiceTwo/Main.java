package ru.mirea.practiceTwo;

import ru.mirea.practiceTwoClasses.*;

import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void main(String[] args) {
        // Testing class Author
        System.out.println("Testing class Author: ");
        Author a1 = new Author("Mikhail Lermontov", "heroOfThePresent@yandex.com", 'M');
        Author a2 = new Author("Ivan Turgenev", "nihilistCritic1818@yandex.ru", 'M');
        a1.setEmail("heroOfThePresent@yandex.ru");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println();

        // Testing class Ball
        System.out.println("Testing class Ball: ");
        Ball b1 = new Ball(123.644, 44.2);
        b1.setY(100.2);
        b1.move(-10.34, 40);
        System.out.println(b1);
    }
}
