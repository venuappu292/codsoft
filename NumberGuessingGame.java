package dharsh_new;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int targetNumber = random.nextInt(100) + 1;
        int userGuess = 0;
        int attemptCount = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've selected a number between 1 and 100.");
        System.out.println("Try your best to guess the number!");

        // Game loop until the user guesses the correct number
        while (userGuess != targetNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attemptCount++;

            // Provide feedback based on user's guess
            if (userGuess < targetNumber) {
                System.out.println("Your guess is too low! Try again.");
            } else if (userGuess > targetNumber) {
                System.out.println("Your guess is too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number correctly!");
                System.out.println("It took you " + attemptCount + " attempts.");
            }
        }

        scanner.close(); // Close the scanner resource
    }
}
