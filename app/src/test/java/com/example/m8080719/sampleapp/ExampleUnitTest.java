package com.example.m8080719.sampleapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testFareFromKm() throws Exception {
        assertEquals(25.0, MainActivity.fareFromKm(2), 0.001);
        assertEquals(34.0, MainActivity.fareFromKm(3), 0.001);
    }

    @Test
    public void testFormatFare () throws Exception {
        assertEquals("25.23", MainActivity.formatFare(25.2344));
    }
}