package com.example.algorithms;

public class QuickSort {
    public static void sort(int[] A){
        sort(A, 0, A.length - 1);
    }

    public static void sort(int[] A, int lowerBound, int upperBound){
        if (lowerBound < upperBound){
            int pivotIndex = partitionAroundPivot(A, lowerBound, upperBound);

            sort(A, lowerBound, pivotIndex -1);
            sort(A, pivotIndex + 1, upperBound);
        }
    }

    private static int partitionAroundPivot(int[] A, int leftIndex, int rightIndex){
        int pivot = A[leftIndex];
        int i = leftIndex + 1;
        for (int j = leftIndex + 1; j <= rightIndex; j++){
            if (A[j] <= pivot){
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
                i++;
            }
        }
        int tmp = A[i-1];
        A[i-1] = pivot;
        A[leftIndex] = tmp;

        return i-1;
    }
}
