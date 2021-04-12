package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

import static com.company.QuickSort.Sort;

public class Main {

    public static void main(String[] args) {
        //runInterval(2, "deterministic");
        //runInterval(0, "random");
        runInterval(1, "optimized");

    }

    public static void runInterval(int mode, String filename) {
        Generate generator = new Generate();

        try (PrintWriter writer = new PrintWriter(new File(filename+"_random"+".csv"))) {
            StringBuilder sb = new StringBuilder();
            sb.append("size(n),counter(comps)\n");

            for (int i = 100; i <= 10000; i += 100) {
                for(int j = 0; j < 100; j++) {
                    int[] A = generator.generateRandomInput(i);
                    int counter = Sort(A, mode);
                    sb.append(Integer.toString(i) + "," + Integer.toString(counter) + "\n");
                }
            }
            writer.write(sb.toString());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try (PrintWriter writer = new PrintWriter(new File(filename+"_partial"+".csv"))) {
            StringBuilder sb = new StringBuilder();
            sb.append("size(n),counter(comps)\n");

            for (int i = 100; i <= 10000; i += 100) {
                for(int j = 0; j < 100; j++) {
                    int[] A = generator.generatePartiallySortedInput(i);
                    int counter = Sort(A, mode);
                    sb.append(Integer.toString(i) + "," + Integer.toString(counter) + "\n");
                }
            }
            writer.write(sb.toString());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try (PrintWriter writer = new PrintWriter(new File(filename+"_mostly"+".csv"))) {
            StringBuilder sb = new StringBuilder();
            sb.append("size(n),counter(comps)\n");

            for (int i = 100; i <= 10000; i += 100) {
                for(int j = 0; j < 100; j++) {
                    int[] A = generator.generateMostlySortedInput(i);
                    int counter = Sort(A, mode);
                    sb.append(Integer.toString(i) + "," + Integer.toString(counter) + "\n");
                }
            }
            writer.write(sb.toString());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }

}
