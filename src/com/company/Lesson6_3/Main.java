package com.company.Lesson6_3;

public class Main {

    public static void main(String[] args) {

        //3
        //Design a class named Triangle (Եռանկյուն)
        //    properties
        //    - sideA
        //    - sideB
        //    - sideC
        //
        //    methods
        //    - calculatePerimeter
        //    - calculateArea

        Triangle triangle = new Triangle(10, 10, 10);

        System.out.println("triangle area: " + triangle.calculateArea());
        System.out.println("triangle perimeter: " + triangle.calculatePerimeter());

    }

}
