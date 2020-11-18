package com.company.Lesson6_1;

public class Main {

    public static void main(String[] args) {

        //1
        //Design a class named Circle
        //    properties
        //    - radius
        //
        //    methods
        //    - calculatePerimeter
        //    - calculateArea

        Circle circle = new Circle(5);

        System.out.println("circle area: " + circle.calculateArea());
        System.out.println("circle perimeter: " + circle.calculatePerimeter());


    }

}
