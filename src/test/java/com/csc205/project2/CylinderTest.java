package com.csc205.project2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    final Cylinder c = new Cylinder(3.0, 1.5);

    @Test
    void surfaceArea() {

        double expected = 42.411500823462205;

        double actual = c.surfaceArea();

        assertEquals(expected, actual);
    }

    @Test
    void volume() {

        double expected = 21.205750411731103;

        double actual = c.volume();

        assertEquals(expected, actual);
    }
}