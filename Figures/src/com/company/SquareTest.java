package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void area() {
        Square s = new Square(1, 2, 3);
        assertEquals(9, s.area());

        s = new Square(56, 78, 3);
        assertEquals(9, s.area());

        s = new Square(1, 2, 0);
        assertEquals(0, s.area());

        s = new Square(1, 2, 345.67);
        assertEquals(345.67*345.67, s.area());
    }

    @Test
    void perimeter() {
        Square s = new Square(1, 2, 4);
        assertEquals(16, s.perimeter());

        s = new Square(56, 78, 4);
        assertEquals(16, s.perimeter());

        s = new Square(1, 2, 0);
        assertEquals(0, s.perimeter());

        s = new Square(1, 2, 345.67);
        assertEquals(345.67*4, s.perimeter());
    }
}