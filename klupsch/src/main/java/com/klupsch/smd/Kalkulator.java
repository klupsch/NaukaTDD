package com.klupsch.smd;
import java.util.*;
import java.util.Scanner;

public class Kalkulator {

    private double zmienna1;
    private double zmienna2;
    private Operacja operacja;

    public double getZmienna1() {
        return zmienna1;
    }

    public void setZmienna1(double zmienna1) {
        this.zmienna1 = zmienna1;
    }

    public double getZmienna2() {
        return zmienna2;
    }

    public void setZmienna2(double zmienna2) {
        this.zmienna2 = zmienna2;
    }

    public Operacja getOperacja() {
        return operacja;
    }

    public void setOperacja(Operacja operacja) {
        this.operacja = operacja;
    }

    public double podajWynik() {
        if (operacja != null) {
            return operacja.oblicz(zmienna1, zmienna2);
        } else {
            return 0;
        }
    }
}
