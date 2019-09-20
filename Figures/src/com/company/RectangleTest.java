package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void area() {
        Rectangle r = new Rectangle(1, 3, 5, 7);
        assertEquals(35, r.area());

        r = new Rectangle(178, 344, 5, 7);
        assertEquals(35, r.area());

        r = new Rectangle(1, 3, 45, 0);
        assertEquals(0, r.area());

        r = new Rectangle(1, 3, 0, 0);
        assertEquals(0, r.area());

        r = new Rectangle(1, 3, 123.45, 456.67);
        assertEquals(123.45 * 456.67, r.area());
    }

    @Test
    void perimeter() {
        Rectangle r = new Rectangle(1, 3, 4, 7);
        assertEquals(22, r.perimeter());

        r = new Rectangle(178, 344, 4, 7);
        assertEquals(22, r.perimeter());

        r = new Rectangle(1, 3, 45, 0);
        assertEquals(90, r.perimeter());

        r = new Rectangle(1, 3, 0, 0);
        assertEquals(0, r.perimeter());

        r = new Rectangle(1, 3, 123.45, 456.67);
        assertEquals((123.45 + 456.67) * 2, r.perimeter());
    }
}