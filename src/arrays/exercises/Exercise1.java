package arrays.exercises;

/**
 * Exercise 1: Single-Dimensional Array
 * TODO:
 * 1. Create an array of 5 integers.
 * 2. Traverse and print elements.
 * 3. Find sum of all elements.
 */
public class Exercise1
{
    public static void main(String[] args)
    {
        // TODO: Implement exercise
        int[] array = {12, 23, 43, 21, 34};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Element "+ i + ": " + array[i] + " ");
            sum += array[i];
        }
        System.out.println();
        System.out.print("Sum of all elements is: -> " + sum);

    }
}
