package com.example.algorithms;

import java.util.Arrays;

public class CountInversions {
    public static int[] merge(int[] A, int[] B) {
        int lengthOutputArray = A.length + B.length;
        int[] sortedArray = new int[lengthOutputArray];

        int i = 0;
        int j = 0;
        for( int k = 0; k < sortedArray.length; k++ ){
            int smallestInt;
            if (A.length > i && B.length > j){
                if (A[i] < B[j]) {
                    smallestInt = A[i];
                    i++;
                } else {
                    smallestInt = B[j];
                    j++;
                }
            } else if (A.length <= i && B.length > j) {
                smallestInt = B[j];
                j++;
            } else {
                smallestInt = A[i];
                i++;
            }
            sortedArray[k] = smallestInt;

        }
        return sortedArray;
    }

    public static int[] sort(int[] X) {
        if (X.length <= 1) {
            return X;
        } else {
            // Divide
            int halfwayIndex = (int) Math.round((X.length / 2));
            int[] A = Arrays.copyOfRange(X,0, halfwayIndex);
            int[] B = Arrays.copyOfRange(X, halfwayIndex, X.length);

            // Conquer
            int[] sorted_A = sort(A);
            int[] sorted_B = sort(B);

            // Clean up
            return merge(sorted_A, sorted_B);
        }
    }
}
