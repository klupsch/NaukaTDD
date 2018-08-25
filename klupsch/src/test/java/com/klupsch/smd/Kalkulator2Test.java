package com.klupsch.smd;

import com.klupsch.smd.exception.Kalkulator2Exception;
import com.klupsch.smd.exception.Kalkulator2Exception2;
import com.sun.istack.internal.NotNull;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;


import static org.junit.Assert.*;

public class Kalkulator2Test {

   Kalkulator2 kalkulator2 = new Kalkulator2();

    @Test
    public void dodaj() {

        //given

        int a = 10;
        int b = 20;

        //when

        double result = kalkulator2.dodaj(a, b);

        //then

        assertTrue(30 == result);
    }

    @Test
    public void dodaj2(){
        //given
        int a = -3;
        int b = 0;

        //when
        double result = kalkulator2.dodaj(-3, 0);

        //then
        assertTrue(-3 == result);

    }

    @Test
    public void odejmij() {

        //given
        int a = 10;
        int b = 3;

        //when
        double result = kalkulator2.odejmij(a, b);

        //then

        assertTrue(7 == result);
    }

    @Test (expected = Kalkulator2Exception.class)
    public void podziel() throws Kalkulator2Exception, Kalkulator2Exception2 {


        //given
        int a = 6;
        int b = 0;


        //when
        double result = kalkulator2.podziel(a, b);


        //then

        assertTrue(0 == result);
    }
    @Test (expected = Kalkulator2Exception2.class)
    public void podziel2  () throws Kalkulator2Exception, Kalkulator2Exception2 {



        //given
        int a = 0;
        int b = 3;


        //when
        double result = kalkulator2.podziel(a, b);


        //then

        assertThat(result).isGreaterThan(0.0);
    }

    @Test
    public void podziel3  () throws Kalkulator2Exception, Kalkulator2Exception2 {


        //given
        int a = 0;
        int b = 3;


        //when
        double result = kalkulator2.podziel(a, b);


        //then

        assertThat(result).isEqualTo(0.0).isGreaterThan(-1.0).isNotNegative();
    }


}