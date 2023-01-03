import java.util.Scanner;

public class ConsoleExercises {

    public static void main (String[] args){
        Scanner scanny = new Scanner(System.in);


        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f\n", pi);
//    System.out.format("The value of pi is approximately %.2f", pi);

        System.out.println("Please pick a number.");
        int randoNumber = scanny.nextInt();
        System.out.println(("Your number is "+randoNumber));

        System.out.println("Please enter 3 words, separated by a space");
        String wordOne = scanny.next();
        String wordTwo = scanny.next();
        String wordThree = scanny.next();
//        System.out.println("This is your words "+wordOne +" " +wordTwo +" " +wordThree);
        System.out.printf("The first word was %s.%n The second word is %s.%n The last word is %s %n", wordOne, wordTwo, wordThree);

        scanny.nextLine();
        System.out.println("Type in a sentence please");
        String sentenceOne = scanny.nextLine();
        System.out.printf("Your sentence is: %s %n", sentenceOne );


        System.out.println("What is the width?");
        int width = Integer.parseInt(scanny.nextLine());
        System.out.println("What is the length?");
        int length = Integer.parseInt(scanny.nextLine());

        float perimeter = (width * 2) + (length * 2);
        float area = width * length;

        System.out.println("The perimeter is "+perimeter);
        System.out.println("The area is "+area);





    }
}
