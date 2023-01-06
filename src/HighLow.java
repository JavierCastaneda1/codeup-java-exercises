import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void guessGame(){
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int guess;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess > secretNumber) {
                System.out.println("Your guess is too high. Try again");
            } else if (guess < secretNumber) {
                System.out.println("Your guess is too low. Try again");
            } else {
                System.out.println("Congratulations! You guessed the number!");
            }
        } while (guess != secretNumber);
    }
    public static void main (String[] args) {

        guessGame();




    }
}
