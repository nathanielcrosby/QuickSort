# QuickSort
COSC-223 QuickSort Analysis

The code is broken up into 2 section: the Java code which runs the variations of Quicksort and stores them into a CSV file and the Python code which plots the data.

The Java code is broken into 3 parts. The Generator class was provided and is used by the runInterval method to create arrays at size intervals of 100, from 100 to 10,000. 
The runInterval method then calls the QuickSort. Sort command on each generated array. 
This command in the Quicksort class takes in the array and runs the Quicksort function, returning the number of comparisons.
The runInterval command then stores the size of the array and the number of comparisons to the CSV. 
To run the program, give the runInterval command a boolean specifying if the Quicksort will be randomized or deterministic (randomized = True).
Also provide the desired name of the CSV files.

The Python code is set up to take in the CSV files and generate plots of the data. 
The random_graph.ipynb is for the randomized quicksort and the deterministic_graph.ipynb is for the deterministic quicksort.
Simply specify the names of the CSV files to run.
