package com.company.Lesson6_8;

import com.company.Lesson6_2.Rectangle;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //8
        //Design a class named Movie
        //    properties
        //        - title
        //        - rating
        //Create 10 movie objects in main, give them titles and random ratings in range (0 - 10) and store them in the array;
        //get the best-rated movie/movies from the array and display the title.

        Random random = new Random();

        Movie[] movies = new Movie[10];
        int maxsimum = 0;

        System.out.println("films.");
        for (int i = 0; i < movies.length; i++) {
            Movie movie = new Movie(String.valueOf(i), random.nextInt(10));
            movies[i] = movie;
        }


        for (int i = 0; i < movies.length; i++) {
            if (maxsimum > movies[i].getRating()) {
                maxsimum = movies[i].getRating();
            }
        }

        for (int i = 0; i < movies.length; i++) {
            if (maxsimum == movies[i].getRating()) {
                System.out.println("best movies is: " + movies[i].getTitle());
            }
        }

    }

}
