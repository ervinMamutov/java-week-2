package arrays.exercises;

/**
 * Exercise 6: Binary Search
 * TODO:
 * 1. Create and sort an array.
 * 2. Ask user for a number.
 * 3. Implement binary search.
 * 4. Print result.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercise6
{
    public static void main(String[] args)
    {
        // TODO: Implement exercise

        int[] array = {12, 234, 45, 546, 23423, 23, 231, 98};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer: -> ");
        int element = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                element = scanner.nextInt();
                break;
            } else {
                System.out.print("The invalid input. Please try again.");
            }
        }
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, element);

        if ((index == -1)) {
            System.out.println("The element doesn't exist");
        } else {
            System.out.println("The element " + element + " index is: " + index);
        }

    }
}

