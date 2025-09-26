package projects.dArrayScoreboard;

import java.util.Scanner;

public class ArrayScoreboard {
    public static void main(String[] args) {

        App.run();;

    }
}

class UserInput {
    private Scanner sc = new Scanner(System.in);

    protected int input() {
        while (true) {
            System.out.print("-> ");
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Entre the invalid number. Please try again.");
                sc.next();
            }
        }
    }

    protected void close() {
        sc.close();
    }

}

class CreateArray{

    protected int[][] doFillArray(int thePlayers, int theGames) {
        int[][] scoreBoard = new int[thePlayers][theGames];

        for (int i = 0; i < thePlayers; i++) {
            for (int j = 0; j < theGames; j++) {
                scoreBoard[i][j] = (int)(Math.random() * 100) + 1;
            }
        }
        return scoreBoard;
    }
}

class DoPrintResult {
//    private int[][] array;
//
//    private DoPrintResult(int[][] array) {
//        this.array = array;
//    }

    protected void doPrint(int[][] array) {

        System.out.print("");
        for (int i = 0; i < array.length; i++) {
            int total = 0;
            System.out.print("The player " + (i + 1) + "    " );
            for (int j = 0; j < array[i].length; j ++) {
                System.out.print("| " + array[i][j] + " |");
                total += array[i][j];
            }
            System.out.print(" Total Score : " + total);
            System.out.println();
            System.out.println("__________________");
        }

    }
}


class App {

    public static void run() {
        UserInput input = new UserInput();

        System.out.print("Enter the number of players ");
        int thePlayers = input.input();

        System.out.print("Enter the number of games ");
        int theGames = input.input();

        CreateArray array = new CreateArray();

        int[][] arrayTotal = array.doFillArray(thePlayers, theGames);

        DoPrintResult printResult = new DoPrintResult();

        printResult.doPrint(arrayTotal);

        input.close();
    }



}


