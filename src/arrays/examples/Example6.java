package arrays.examples;

/**
 * Example 6: Binary Search
 * -------------------------
 * Write a program that searches for a specific element in a sorted array using binary search.
 * Binary search divides the search interval in half each time, making it more efficient than linear search.
 */

import java.util.Arrays;

public class Example6
{
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        Arrays.sort(arr); // Binary search requires to be sorted array

        int key = 3;
        int index = Arrays.binarySearch(arr, key);

        System.out.println("Sorted array: " + Arrays.toString(arr));

        // index == -1 means not found
        if (index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found");
    }
}
