package com.company;

import static java.lang.Math.PI;

public class Circle {
    private double x, y, radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double area() {
        return PI * radius * radius;
    }

    public double perimeter() {
        return PI * radius * 2;
    }
}
