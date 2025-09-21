package arrays.examples;

/**
 * Example 5: Linear Search
 * -------------------------
 * Write a program that searches for a specific element in an array using linear search.
 * Linear search checks each element one by one until it finds the target or reaches the end of the array.
 */

public class Example5
{
    public static void main(String[] args)
    {
        int[] arr = {4, 7, 1, 9, 3};
        int key = 9;
        int index = -1;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == key)
            {
                index = i;
                break;
            }
        }

        if (index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found");
    }
}
