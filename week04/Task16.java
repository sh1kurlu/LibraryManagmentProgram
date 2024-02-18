package week04;

import java.util.Scanner;

import week03.geometry.Point;

public class Task16 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int numPoints = inputScanner.nextInt();
        inputScanner.nextLine(); 
        Point[] points = new Point[numPoints];

        for (int i = 0; i < numPoints; i++) {
            float xCoordinate = inputScanner.nextFloat();
            float yCoordinate = inputScanner.nextFloat();
            points[i] = new Point(xCoordinate, yCoordinate);
            inputScanner.nextLine(); 
        }

        Point northernmost = points[0];
        Point southernmost = points[0];
        Point westernmost = points[0];
        Point easternmost = points[0];

        for (int i = 1; i < points.length; i++) {
            if (points[i].getY() > northernmost.getY()) {
                northernmost = points[i];
            }
            if (points[i].getY() < southernmost.getY()) {
                southernmost = points[i];
            }
            if (points[i].getX() < westernmost.getX()) {
                westernmost = points[i];
            }
            if (points[i].getX() > easternmost.getX()) {
                easternmost = points[i];
            }
        }

        printExtremePoints(points, northernmost.getY());
        printExtremePoints(points, southernmost.getY());
        printExtremePoints(points, westernmost.getX());
        printExtremePoints(points, easternmost.getX());

        inputScanner.close();
    }

    public static void printExtremePoints(Point[] points, float value) {
        for (Point point : points) {
            if (point.getX() == value || point.getY() == value) {
                System.out.println("(" + point.getX() + ", " + point.getY() + ")");
            }
        }
    }
}
