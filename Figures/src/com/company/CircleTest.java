package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void area() {
        Circle c = new Circle(1, 2, 3);
        assertEquals(Math.PI * 9, c.Area());

        c = new Circle(56, 89, 3);
        assertEquals(Math.PI * 9, c.Area());

        c = new Circle(56, 89, 0);
        assertEquals(0, c.Area());

        c = new Circle(56, 89, 456.78);
        assertEquals(456.78 * 456.78 * Math.PI, c.Area());
    }

    @Test
    void perimeter() {
        Circle c = new Circle(1, 2, 3);
        assertEquals(Math.PI * 6, c.Perimeter());

        c = new Circle(56, 89, 3);
        assertEquals(Math.PI * 6, c.Perimeter());

        c = new Circle(56, 89, 0);
        assertEquals(0, c.Perimeter());

        c = new Circle(56, 89, 456.78);
        assertEquals(2 * 456.78 * Math.PI, c.Perimeter());
    }
}