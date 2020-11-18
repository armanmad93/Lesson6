package com.company.Lesson6_2;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //2
        //Design a class named Rectangle (ուղանկյուն)
        //    properties
        //    - height
        //    - width
        //
        //    methods
        //    - calculatePerimeter
        //    - calculateArea

        Rectangle rectangle = new Rectangle(8, 5);

        System.out.println("rectangle area: " + rectangle.calculateArea());
        System.out.println("rectangle perimeter " + rectangle.calculatePerimeter());

    }

}
