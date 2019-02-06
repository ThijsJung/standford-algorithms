package com.example.algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class MergeSortTest {
    @Test
    void itDoesNotTouchEmptyArray() {
        int[] A = new int[0];
        int[] B = new int[0];
        int[] outcome = MergeSort.merge(A, B);

        assertEquals(outcome.length, 0);
    }

    @Test
    void itSortsTwoArraysWithOneValueInOrder() {
        int[] A = { 1 };
        int[] B = { 3 };
        int[] outcome = MergeSort.merge(A, B);

        assertEquals(outcome[0], 1);
        assertEquals(outcome[1], 3);
    }

    @Test
    void itSortsArraysOfEqualLengths() {
        int[] A = {1, 6, 5, 3};
        int[] outcome = MergeSort.sort(A);

        assertEquals(outcome[0], 1);
        assertEquals(outcome[1], 3);
        assertEquals(outcome[2], 5);
        assertEquals(outcome[3], 6);
    }

    @Test
    void itSortsArraysOfDifferentLengths() {
        int[] A = { 1, 6, 5, 8, 3};
        int[] outcome = MergeSort.sort(A);

        assertEquals(outcome[0], 1);
        assertEquals(outcome[1], 3);
        assertEquals(outcome[2], 5);
        assertEquals(outcome[3], 6);
        assertEquals(outcome[4], 8);
    }
}