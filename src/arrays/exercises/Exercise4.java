package arrays.exercises;

/**
 * Exercise 4: Array Operations
 * TODO:
 * 1. Create an array of 6 integers.
 * 2. Sort array.
 * 3. Copy into another array.
 * 4. Search for a value.
 * 5. Compare two arrays.
 */

import java.util.Arrays;
public class Exercise4
{
    public static void main(String[] args)
    {
        // TODO: Implement exercise
            int[] array = {21, 34, 23, 90, 32, 22};

            Arrays.sort((array));
            System.out.println("Sorted array: -> " + Arrays.toString(array));

            int[] copy = Arrays.copyOf(array, array.length);
            System.out.println("Copied array: -> " + Arrays.toString(copy));


        int index = Arrays.binarySearch(array, 90);
        System.out.println("Find element 90: it is -> " +  index);

        System.out.println("Compare arrays: " + Arrays.equals(array, copy));






    }
}

