package ru.mirea;

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

    public static int turnDigits(int n) {
        if (n > 9)
            return (n % 10 * (n / 10))
    }

    public static void main(String[] args) {
	    chisla(5);
        System.out.println("\n" + sumDigits(345));
    }
}
