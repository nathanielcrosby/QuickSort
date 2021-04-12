package com.company;

import java.util.Random;

public class QuickSort {
    private static Random rn = new Random();
    private static int counter = 0;


    public static int Sort(int[] A, int mode) {
        counter = 0;
        Sort(A, 0, A.length-1, mode);
        return counter;
    }

    private static void Sort(int[] A, int lo, int hi, int mode) {
        if (hi > lo) {
            int r;
            if (mode == 0)
                r = rn.nextInt(hi - lo + 1) + lo;
            else if (mode == 1)
                r = (int) (rn.nextInt((int)(0.5*(hi - lo) + 1)) + lo + (0.25*(hi-lo)));
            else
                r = hi;
            int p = Partition(A, lo, hi, r);
            Sort(A, lo, p-1, mode);
            Sort(A,p + 1, hi, mode);
        }
    }

    private static int Partition(int[] A, int lo, int hi, int r) {
        Swap(A, r, hi);
        int j = hi-1, i = lo;
        while (i <= j) {
            if (A[i] <= A[hi]) {
                i++;
            } else {
                Swap(A, i, j);
                j--;
            }
            counter++;
        }
        Swap(A, hi, j+1);
        return j+1;
    }

    private static void Swap(int[] A, int i, int j) {
        int ival = A[i], jval = A[j];
        A[j] = ival;
        A[i] = jval;
    }
}
