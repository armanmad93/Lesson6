package com.company.Lesson6_6;

public class Main {

    public static void main(String[] args) {

        //6
        //Design a class named DistanceConverter
        //    methods
        //    - convertMetersToMiles
        //    - convertMilesToMeters

        DistanceConverter distanceConverter = new DistanceConverter();
        double miles = distanceConverter.convertMetersToMiles(1609);
        double meter = distanceConverter.convertMilesToMeters(1);

        System.out.println("convertMetersToMiles: " + miles);
        System.out.println("convertMilesToMeters: " + meter);


    }

}
