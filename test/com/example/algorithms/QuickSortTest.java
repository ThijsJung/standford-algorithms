package com.example.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    @Test
    void itDoesNotSortAnEmptyArray() {
        int[] A = new int[0];

        assertEquals(A.length, 0);
    }

    @Test
    void itReturnsAnArrayWithLengthOne(){
        int[] A = {1};

        assertEquals(A[0], 1);
    }

    @Test
    void itSortsAnArrayWithLengthTwoThatIsAlreadyInOrder(){
        int[] A = {1,3};

        assertEquals(A[0], 1);
        assertEquals(A[1], 3);
    }

    @Test
    void itSortsAnArrayWithLengthTwoThatIsOutOfOrder(){
        int[] A = {3, 1};
        QuickSort.sort(A);

        assertEquals(A[0], 1);
        assertEquals(A[1], 3);
    }

    @Test
    void itSortsAnArrayWithThreeEntriesThatAreOrdered(){
        int[] A = {1, 3, 7};
        QuickSort.sort(A);

        assertEquals(A[0], 1);
        assertEquals(A[1], 3);
        assertEquals(A[2], 7);

    }

    @Test
    void itSortsAnArrayWithThreeEntriesThatAreOutOfOrder(){
        int[] A = {3, 1, 7};
        QuickSort.sort(A);

        assertEquals(A[0], 1);
        assertEquals(A[1], 3);
        assertEquals(A[2], 7);
    }

    @Test
    void itSortsAnArrayWithDuplicatedValues(){
        int[] A = {3, 1, 3};
        QuickSort.sort(A);

        assertEquals(A[0], 1);
        assertEquals(A[1], 3);
        assertEquals(A[2], 3);
    }

    @Test
    void itSortsAnArrayWithFiveEntriesThatAreOutOfOrder(){
        int[] A = {5, 2, 7, 3, 8};
        QuickSort.sort(A);

        assertEquals(A[0], 2);
        assertEquals(A[1], 3);
        assertEquals(A[2], 5);
        assertEquals(A[3], 7);
        assertEquals(A[4], 8);
    }

    @Test
    void itSortsTheExampleArrayFromTheVideo(){
        int[] A = {3, 8, 2, 5, 1, 4, 7, 6};
        QuickSort.sort(A);

        assertEquals(A[0], 1);
        assertEquals(A[1], 2);
        assertEquals(A[2], 3);
        assertEquals(A[3], 4);
        assertEquals(A[4], 5);
        assertEquals(A[5], 6);
        assertEquals(A[6], 7);
        assertEquals(A[7], 8);
    }

//    Write tests with duplicated entries;
}
