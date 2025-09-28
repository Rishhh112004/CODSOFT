// Number guessing game with
// Unlimited Rounds and Score Tracking
import java.util.Scanner;
public class numberGuessingGame {
    public static void numberGuessingGame()
    {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());    // Generate a random number between 1 and 100   
        int attempts = 0;       // Track the number of attempts
        int K = 5;     // Maximum attempts per round
        boolean guessedCorrectly = false;
        System.out.println(
            "A number is chosen between 1 and 100.");
        System.out.println(
            "You have " + K
            + " attempts per round to guess the correct number.");
        while (!guessedCorrectly) {            
            // Give the user K attempts per round
            for (int i = 0; i < K; i++) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++; // Increment attempt count
                if (guess == number) {
                    System.out.println(
                        "Congratulations! You guessed the correct number in "
                        + attempts + " attempts.");
                    guessedCorrectly = true;
                    break;
                }
                else if (guess < number) {
                    System.out.println(
                        "The number is greater than "
                        + guess);
                }
                else {
                    System.out.println(
                        "The number is less than " + guess);
                }
            }
            if (!guessedCorrectly) {                
                // Ask the user if they want to continue
                // after exhausting K attempts
                System.out.println("You have used all " + K
                                   + " attempts.");
                System.out.print(
                    "Do you want to continue guessing? (yes/no): ");
                String response = sc.next();
                if (!response.equalsIgnoreCase("yes")) {
                    System.out.println(
                        "Game Over! The correct number was: "
                        + number);
                    break;
                }
            }
        }
        sc.close();
    }
    public static void main(String[] args)
    {
        numberGuessingGame();
    }
}
