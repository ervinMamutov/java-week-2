package projects.primeNumberChecker;
import projects.arrayStatistics.UserInput;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}

class Calculate{
    public boolean isPrime(int number) {
        boolean isPrimer = false;
        for (int i = 2; i < number; i++) {
           if (number % i == 0) {
               isPrimer =false;
               return isPrimer;
           } else {
               isPrimer = true;
           };
        }
        return isPrimer;
    }
}

class App {
    UserInput input = new UserInput();
    public void run() {

        System.out.print("Enter the number for checking: -> ");
        int number = input.input();
        Calculate calculate = new Calculate();
        if (number <= 2) { System.out.println("This number is not Prime Number");}
        if ((calculate.isPrime(number))) {
            System.out.println("This number is Prime Number");
        } else {
            System.out.println("This number is not Prime Number");
        }
    }
}

