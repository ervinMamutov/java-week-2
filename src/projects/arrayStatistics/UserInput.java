package projects.arrayStatistics;

import java.util.Scanner;

public class UserInput {
    private final Scanner scanner = new Scanner(System.in);

    public int input() {
        int n = 0;
        while(true) {
            //System.out.print("Enter number: -> ");
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Entered the invalid numbers into the array. Please try again.");
                scanner.next();
            }
        }
    }

    protected void close(){
        scanner.close();
    }
}