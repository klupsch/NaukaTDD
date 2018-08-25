package com.klupsch.smd;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    static Kalkulator kalkulator = new Kalkulator();


    public static void main(String[] args) {
        String znakOperacji;
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Prosze podaj pierwsza liczbe: ");
        kalkulator.setZmienna1(inputScanner.nextDouble());

        System.out.println("Prosze podaj operacje( + | - | * | / ): ");
        znakOperacji = inputScanner.next();

        System.out.println("\nProsze podaj druga liczbe: ");
        kalkulator.setZmienna2(inputScanner.nextDouble());

        switch (znakOperacji) {
            case "+":
                kalkulator.setOperacja(new Dodaj());
                break;
            case "-":
                kalkulator.setOperacja(new Odejmij());
                break;
            case "/":
                kalkulator.setOperacja(new Podziel());
                break;
            case "*":
                kalkulator.setOperacja(new Pomnoz());
                break;
        }

        System.out.println("wynik dzialania " + kalkulator.podajWynik());
    }
}
