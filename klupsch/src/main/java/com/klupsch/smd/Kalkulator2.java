package com.klupsch.smd;

import com.klupsch.smd.exception.Kalkulator2Exception;
import com.klupsch.smd.exception.Kalkulator2Exception2;

import javax.management.openmbean.KeyAlreadyExistsException;

public class Kalkulator2 {
    public double dodaj(int a, int b) {
        return a + b;
    }

    public double odejmij(int a, int b) {
        return a - b;

    }

    public double podziel(int a, int b) throws Kalkulator2Exception,
            Kalkulator2Exception2 {
        if (b == 0) {
            throw new Kalkulator2Exception("Nie dziel przez zero");
        }

        if (a == 0)
        {
            throw new Kalkulator2Exception2("Wynik nie jest większy od 0");
        }
        return a / b;

    }

    public double mnozenie(int a, int b) {
        return a * b;
    }
}