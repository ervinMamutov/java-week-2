package arrays.exercises;

/**
 * Exercise 3: Jagged Array
 * TODO:
 * 1. Create a jagged array with 3 rows.
 * 2. Assign values manually.
 * 3. Traverse and print array.
 * 4. Find total number of elements.
 */
public class Exercise3
{
    public static void main(String[] args)
    {
        // TODO: Implement exercise
        int[][] jagged = new int[3][];
        jagged[0] = new int[]{1, 2, 3};
        jagged[1] = new int[]{2, 54};
        jagged[2] = new int[]{12};
        int count = 0;
        for(int i = 0; i < jagged.length; i++) {
            System.out.println();
            for(int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("The total elements int the jagged to: -> " + count);

    }
}
