package numbers;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int minNumber = 1;
            int maxNumber = 100;
            int randomNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
            int userGuess;

            System.out.println("Welcome to the Guess the Number game!");
            System.out.println("I've picked a random number between " + minNumber + " and " + maxNumber + ". Try to guess it!");

            do {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();

                if (userGuess < randomNumber) {
                    System.out.println("Too low, try again.");
                } else if (userGuess > randomNumber) {
                    System.out.println("Too high, try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                }
            } while (userGuess != randomNumber);

            scanner.close();
        }
    }


