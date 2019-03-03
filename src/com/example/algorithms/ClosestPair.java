package com.example.algorithms;
import com.example.datastructures.Point;

public class ClosestPair {
    public static Point[] find(Point[] points) {
        if (points.length <= 1){
            return new Point[0];
        }
        else if(points.length < 4){
            return bruteForce(points);
        }
        else {
            return new Point[0];
        }
    }

    private static Point[] bruteForce(Point[] points) {
        Point[] bestPair = {points[0], points[1]};
        double shortest_distance = calculateDistance(points[0], points[1]);
        for (int i = 0; i < points.length - 1; i++){
            for (int j = i + 1; j < points.length; j++) {
                Point p = points[i];
                Point q = points[j];
                double distance = calculateDistance(p, q);
                if (distance < shortest_distance) {
                    bestPair[0] = p;
                    bestPair[1] = q;
                    shortest_distance = distance;
                }

            }
        }
        return bestPair;
    }

    private static double calculateDistance(Point p, Point q){
        int xDistance = p.getX() - q.getX();
        int yDistance = p.getY() - q.getY();

        return Math.sqrt(
                Math.pow(xDistance, 2) + Math.pow(yDistance, 2)
        );
    }
}
