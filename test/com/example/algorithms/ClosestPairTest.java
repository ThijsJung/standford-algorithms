package com.example.algorithms;

import com.example.datastructures.Point;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ClosestPairTest {
    @Test
    void itIgnoresAnEmptyArray() {
        Point[] points = new Point[0];
        Point[] outcome = ClosestPair.find(points);

        assertEquals(0, outcome.length);
    }

    @Test
    void itIgnoresArraysWithOnePoint() {
        Point[] points = {new Point(0,0)};

        Point[] outcome = ClosestPair.find(points);

        assertEquals(0, outcome.length);

    }

    @Test
    void itFindsTheShortestDistanceAmongTwoPoints() {
        Point P = new Point(0, 0);
        Point Q = new Point(2,1);
        Point[] points = {P, Q};

        Point[] outcome = ClosestPair.find(points);

        assertEquals(2, outcome.length);
        assertTrue(Arrays.stream(outcome).anyMatch(point -> point == P));
        assertTrue(Arrays.stream(outcome).anyMatch(point -> point == Q));
    }

    @Test
    void itFindsTheShortestDistanceAmongThreePoints() {
        Point P = new Point(0,0);
        Point Q = new Point(3,1);
        Point R = new Point(2,3);
        Point[] points = {P, Q, R};

        Point[] outcome = ClosestPair.find(points);

        assertTrue(Arrays.stream(outcome).anyMatch(point -> point == R));
        assertTrue(Arrays.stream(outcome).anyMatch(point -> point == Q));
    }

    @Test
    void itFindsTheShortestDistanceAmongThreePointsRegardlessOfTheOrder() {
        Point P = new Point(0,0);
        Point Q = new Point(3,1);
        Point R = new Point(2,3);
        Point[] points = {R, P, Q};

        Point[] outcome = ClosestPair.find(points);

        assertTrue(Arrays.stream(outcome).anyMatch(point -> point == R));
        assertTrue(Arrays.stream(outcome).anyMatch(point -> point == Q));
    }

    @Test
    void itFindsTheShortestDistanceAmongFourPoints() {
        Point P = new Point(0,0);
        Point Q = new Point(3,1);
        Point R = new Point(2,3);
        Point S = new Point(3,4);
        Point[] points = {R, P, Q, S};

        Point[] outcome = ClosestPair.find(points);

        assertTrue(Arrays.stream(outcome).anyMatch(point -> point == R));
        assertTrue(Arrays.stream(outcome).anyMatch(point -> point == Q));
    }
}