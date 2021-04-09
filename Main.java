package com.company;


import java.util.Arrays;

import static com.company.QuickSort.Sort;

public class Main {

    public static void main(String[] args) {
        Generate generator = new Generate();
	    int[] A = generator.generateRandomInput(1000000);

	    int counter = Sort(A, true);
        System.out.println(counter);
    }


}
