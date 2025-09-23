package arrays.exercises;

/**
 * Exercise 2: Multi-Dimensional Array
 * TODO:
 * 1. Create a 2x3 array.
 * 2. Assign values.
 * 3. Traverse and print matrix.
 * 4. Calculate sum of elements.
 */
public class Exercise2
{
    public static void main(String[] args)
    {
        // TODO: Implement exercise
        int[][] matrix = {
                {21, 32, 43},
                {32, 54, 1},
                {54, 3, 87},
        };
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
                sum += matrix[i][j];
            }
        }
        System.out.println();
        System.out.println("The sum of the elements of the matrix is equal to: -> " + sum);
    }
}
