package projects.arrayStatistics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStatistic {
    public static void main(String[] args) {
        App.run();;
    }
}



class UserArray {

    public int[] createArray(int number) {
        return new int[number];
    }

    public int[] fillTheArray(int[] array, int input) {
        Arrays.fill(array, input);

        return array;
    }

}

class Calculate {

    public int max(int[] array) {
        int max = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public int min(int[] array) {
        int min = 0;

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < array[i - 1]) {
                array[i - 1] = array[i];
                min = array[i - 1];

            } else {
                array[i] = array[i - 1];
                min = array[i];
            }
        }
        return min;
    }

    public int theSumArray(int[] array) {
        int sum = 0;
        for (int item : array) {
            sum += item;
        }
        return sum;
    }

    public int average(int[] array) {
        return theSumArray(array) / array.length;
    }
}


class App {

    public static void run() {
        int number = 0;
        UserInput input = new UserInput();

        while (true) {
            System.out.print("Enter number of array: -> ");
            number = input.input();
            if (number > 0) {
                 break;
            } else {
                System.out.println("Enter the invalid number. Please try again");
            }
        }

        int[] userArray = new int[number];

        for (int i = 0; i < userArray.length; i++) {
            System.out.print("Enter array [" + (i + 1) + "] item: -> ");
            userArray[i] = input.input();
        }

        Calculate calculate = new Calculate();

        System.out.println();
        System.out.println("Max element = " + calculate.max(userArray));
        System.out.println("Min element = " + calculate.min(userArray));
        System.out.println("Sum of array elements =  " + calculate.theSumArray(userArray));
        System.out.println("The average of array elements = " + calculate.average(userArray));

        input.close();
    }
}
