package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumTest {
    @Test
    void sum() {

        // Was ist gegeben? "Given" - Daten die uns vorliegen
        int a = 1;
        int b = 1;
        int expectedResult = 2;

        //Wenn... "When" - Hier lassen wir unsere Methoden laufen
        int result = Sum.sum(a,b);

        //Läuft es wie es soll? - "Then"
        assertEquals(expectedResult, result);
    }


}