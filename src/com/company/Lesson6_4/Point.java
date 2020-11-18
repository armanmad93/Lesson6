package com.company.Lesson6_4;

public class Point {

    private int coordinateX;
    private int coordinateY;

    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public int distance() {
        return (int) Math.sqrt(Math.pow(coordinateX, 2) + Math.pow(coordinateY, 2));
    }

    public int distance(int coordinateX, int coordinateY) {
        int differenceX = this.coordinateX - coordinateX;
        int differenceY = this.coordinateY - coordinateY;
        return (int) Math.sqrt(Math.pow(differenceX, 2) + Math.pow(differenceY, 2));
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }
}
