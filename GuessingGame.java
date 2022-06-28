import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random() * 100 + 1);
        System.out.println("A random number has been generated...");
        Scanner scanner = new Scanner(System.in);

        for (int remainingGuesses = 2; remainingGuesses >= 0; remainingGuesses--) {
            System.out.println("Enter a guess between 1 and 100");
            int userAnswer = scanner.nextInt();

            guess(userAnswer, computerNumber, remainingGuesses);
        }

        System.out.println("Sorry for your luck, restart the program to play again!");
    }

    private static void guess(int userAnswer, int computerNumber, int remainingGuesses) {
        String guessAgain = remainingGuesses > 0 ? ", guess again." : "";
        if (userAnswer <= 0 || userAnswer > 100) {
            System.out.println("Invalid response");
        } else if (userAnswer == computerNumber) {
            System.out.println("Correct! You win! See you next time!");
            System.exit(0);
        } else if (userAnswer > computerNumber) {
            System.out.println("Your guess is too high" + guessAgain);
        } else if (userAnswer < computerNumber) {
            System.out.println("Your guess is too low" + guessAgain);
        } else {
            System.out.println("Your guess is incorrect");
        }
    }
}