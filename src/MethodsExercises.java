import java.util.Random;
import java.util.Scanner;


public class MethodsExercises {
    public static Scanner scannyScan = new Scanner(System.in);

    public static int addition(int a, int b){
        return a + b;
    }
    public static int subtraction(int a, int b){
        return a - b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static int divide(int a, int b){
        return a / b;
    }

    public static int modulus(int a, int b){
        return a % b;
    }

    public static int multiloop(int a, int b){
        int result = 0;
        for (int i=0; i < b; i++){
            result += a;
        }
        return result;
    }

    public static int getRange(int min, int max){
        while(true){
            System.out.println("Enter a number between " + min + " and " + max + ".");
            int input = scannyScan.nextInt();
            if (input >= min && input <= max){
                return input;
            }
            System.out.println("Invalid input. Please try again");
        }
    }

    public static int getRangeTwo (int min, int max){
        System.out.println("Enter a number between " + min + " and " + max + ".");
        int inputTwo = scannyScan.nextInt();
        if(inputTwo < min || inputTwo > max){
            System.out.println("Invalid input. Please try again");
            return getRangeTwo(min,max);
        }
        return inputTwo;
    }

    public static void factorioMeth (){
        while(true) {
        System.out.println("Enter a number to do a factorial on. (Must be 1-10)");
        long factorialNum = scannyScan.nextInt();
        if (factorialNum < 1 || factorialNum > 10) {
            System.out.println("Invalid input. Please try again");
            continue;
        }

        long factTrial = 1;
        for (long i = 1; i <= factorialNum; i++) {
            factTrial *= i;
        }
        System.out.println("The factorial of " + factorialNum + " is " + factTrial);
        break;
        }
    }

    public static void diceRoll(){

        boolean confirmation;

        do{
            System.out.println("Enter the number of sides for the pair of dice: ");
            int userInputDice = scannyScan.nextInt();

            int dice1 =(int)Math.floor(Math.random()*(userInputDice)+1);
            int dice2 = (int)Math.floor(Math.random()*(userInputDice)+1);

            System.out.printf("Dice one rolls: %d%nDice two rolls: %d%n", dice1, dice2);

            System.out.println("Do you want to roll again? [Y/N] ");
            String userConfirm = scannyScan.next();
            confirmation = userConfirm.equalsIgnoreCase("Y");
            scannyScan.nextLine();
        } while (confirmation);


    }

    public static void guessGame(){
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int guess;
        do {
            System.out.println("Enter your guess: ");
            guess = scannyScan.nextInt();

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

        System.out.println(addition(4,4));
        System.out.println(subtraction(4,4));
        System.out.println(multiply(4,4));
        System.out.println(divide(10,5));
        System.out.println(modulus(10, 3));
        System.out.println(multiloop(12,12));
        System.out.println(getRange(1,10));
        int range = getRangeTwo(1,10);
        System.out.println("You entered: " +range);
        factorioMeth();
        diceRoll();
        guessGame();




    }
}
