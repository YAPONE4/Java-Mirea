package ru.mirea;

import java.util.Scanner;

public class Main {

    public static void chisla(int n) {
        if (n == 1)
            System.out.println(1);
        else {
            chisla(n - 1);
            System.out.println(n);
        }
    }

    public static int sumDigits(int n) {
        if (n > 9)
            return (n % 10 + sumDigits(n / 10));
        else
            return n;
    }

    public static int turnDigits(int pr, int ch) {
        Scanner rd = new Scanner(System.in);
        int newone = rd.nextInt();
        if (pr == 0 && newone == 0)
            return (0);
        else
            if (pr == ch)
                return(1 + turnDigits(newone, ch));
            else
                return(turnDigits(newone, ch));
    }

    public static void main(String[] args) {
        System.out.println("Вывод последовательности от 1 до 5:");
	    chisla(5);
        System.out.println("Сумма цифр числа 345: ");
        System.out.println("\n" + sumDigits(345));
        Scanner rd = new Scanner(System.in);
        System.out.println("Введите последовательность, которая оканчивается двумя нулями (сколько" +
                " повторяется число 3): ");
        int newone = rd.nextInt();
        System.out.println(turnDigits(newone, 3));
    }
}
