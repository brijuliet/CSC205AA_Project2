package com.csc205.project2;

import static org.junit.jupiter.api.Assertions.*;

class CubeTest {

    final Cube s = new Cube(2.0);

    @org.junit.jupiter.api.Test
    void surfaceArea() {

        double expected = 24.0;

        double actual = s.surfaceArea();

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void volume() {

        double expected = 8.0;

        double actual = s.volume();

        assertEquals(expected, actual);

    }
}