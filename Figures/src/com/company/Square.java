package com.company;

public class Square {
    private double x, y, size;

    public Square(double x, double y, double size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public double area() {
        return size * size;
    }

    public double perimeter() {
        return size * 4;
    }
}
