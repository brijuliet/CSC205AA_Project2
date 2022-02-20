package com.csc205.project2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SphereTest {

    final Sphere r = new Sphere(6.0);

    @Test
    void surfaceArea() {

        double expected = 452.3893421169302;

        double actual = r.surfaceArea();

        assertEquals(expected, actual);
    }

    @Test
    void volume() {

        double expected = 904.7786842338603;

        double actual = r.volume();

        assertEquals(expected, actual);
    }
}