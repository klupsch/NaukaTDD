package com.klupsch.smd;

public class Odejmij implements Operacja {
    @Override
    public double oblicz(double liczba1, double liczba2) {
        return liczba1 - liczba2;
    }
}
