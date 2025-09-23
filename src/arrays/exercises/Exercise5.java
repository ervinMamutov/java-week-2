package arrays.exercises;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Exercise 5: Linear Search
 * TODO:
 * 1. Create an array of integers.
 * 2. Ask user for a number.
 * 3. Implement linear search.
 * 4. Print index if found or "Not found".
 */
public class Exercise5 {
    public static void main(String[] args) {
        // TODO: Implement exercise

        int[] array = {12, 234, 45, 546, 23423, 23, 231, 98};

        Scanner scanner = new Scanner(System.in);

        int element = 0;
        boolean isExist = false;

        while (true) {
            System.out.print("Enter integer: -> ");
            if (scanner.hasNextInt()) {
                element = scanner.nextInt();
                break;
            } else {
                System.out.print("The invalid input. Please try again.");
                scanner.next();
            }
        }
        for (int j : array) {
            isExist = j == element;
            if (isExist)
                break;
        }

        if (isExist) {
            System.out.println("The element " + element + " is exist");
        } else {
            {
                System.out.println("The element doesn't exist");
            }
        }
    }
}

