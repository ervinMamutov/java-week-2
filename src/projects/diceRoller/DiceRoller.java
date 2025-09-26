package projects.diceRoller;
import projects.arrayStatistics.UserInput;

public class DiceRoller {
    public static  void main(String[] args) {
        App app = new App();

        app.run();
    }
}

class App {

    UserInput input = new UserInput();


    public void run() {
        System.out.print("Enter how many times you want to roll the dice: ->  ");
        int times = input.input();
        int[] theDiceRoll = new int[times];
    int sum = 0;
        for (int i = 0; i < times; i++) {
            theDiceRoll[i] = rollDice();
            sum += theDiceRoll[i];
            System.out.println((i + 1) + " roll of the dice: -> " + theDiceRoll[i]);
        }
        System.out.print("The total score: " + sum);
    }

    public int rollDice() {
        return (int)(Math.random() * 6) + 1;
    }



}

