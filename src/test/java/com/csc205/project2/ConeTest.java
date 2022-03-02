package com.csc205.project2;

import static org.junit.jupiter.api.Assertions.*;

class ConeTest {

    final Cone k = new Cone(8.5, 3);

    @org.junit.jupiter.api.Test
    void surfaceArea() {

        double expected = 113.22813437585047;

        double actual = k.surfaceArea();

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void volume() {

        double expected = 80.11061266653972;

        double actual = k.volume();

        assertEquals(expected, actual);

    }
}