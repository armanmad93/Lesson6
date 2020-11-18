package com.company.Lesson6_4;

public class Main {

    public static void main(String[] args) {

        //4
        //Design a class named Point (կետ)
        //    properties
        //    - coordinateX
        //    - coordinateY
        //
        //    methods
        //    - distance()  (from 0:0 coordinate)
        //    - distance(Point point) ( Overloaded method to get the distance between 2 points )

        Point point = new Point(5, 6);

        int distance1 = point.distance();
        int distance2 = point.distance(2, 2);

        System.out.println("distance from 0 : 0 coordinate: " + distance1);
        System.out.println("distance from X : Y coordinate: " + distance2);

    }

}
