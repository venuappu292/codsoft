import java.util.Scanner;

public class QUIZ {
    
    static int score = 0;

    // Method to ask a question and check the answer
    public static void askQuestion(String question, String[] options, String correctAnswer) {
        Scanner scanner = new Scanner(System.in);

        // Display question and options
        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }

        // Start timer (20 seconds countdown)
        long startTime = System.currentTimeMillis();
        System.out.println("You have 20 seconds to answer!");

        // Capture the user's answer and check if time is up
        long elapsedTime;
        int userAnswer = 0;
        while (true) {
            if (System.currentTimeMillis() - startTime >= 20000) {
                System.out.println("Time's up!");
                break;
            }
            if (scanner.hasNextInt()) {
                userAnswer = scanner.nextInt();
                break;
            }
        }

        // Validate the answer
        if (options[userAnswer - 1].equalsIgnoreCase(correctAnswer)) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is: " + correctAnswer);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questions and answers
        String question1 = "What is the capital of France?";
        String[] options1 = {"Berlin", "Madrid", "Paris", "Rome"};
        String correctAnswer1 = "Paris";

        String question2 = "Who developed Java programming language?";
        String[] options2 = {"Dennis Ritchie", "James Gosling", "Bjarne Stroustrup", "Guido van Rossum"};
        String correctAnswer2 = "James Gosling";

        String question3 = "Which is the largest planet in our solar system?";
        String[] options3 = {"Earth", "Mars", "Jupiter", "Saturn"};
        String correctAnswer3 = "Jupiter";

        // Start quiz
        System.out.println("Welcome to the Quiz!");
        
        // Ask questions
        askQuestion(question1, options1, correctAnswer1);
        askQuestion(question2, options2, correctAnswer2);
        askQuestion(question3, options3, correctAnswer3);

        // Show final score
        System.out.println("\nYour total score is: " + score + " out of 3.");
    }
}
