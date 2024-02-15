import subclasses.Mergesort;
import java.util.Random;

import subclasses.Bubblesort;

public class driver {
    public static void main(String[] args) {
        Random random = new Random();
        int arraySize = 99999;
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(100000); 
        }

        long start1 = System.currentTimeMillis();
        Mergesort.sort(array); 
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        Bubblesort.bubbleSort(array);
        long end2 = System.currentTimeMillis();

        System.out.println("Time taken to sort (in milliseconds) for MergeSort is: " + (end1 - start1));
        System.out.println("Time taken to sort (in milliseconds) for BubbleSort is: " + (end2 - start2));
        System.out.println("MergeSort is " + ((end2 - start2) - (end1 - start1)) + " ms faster than BubbleSort.");
    }
    
}
