package com.company.Lesson6_1;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculatePerimeter() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateArea() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
