import java.util.Scanner;

public class Bob {
    public static void main (String[] args) {

        Scanner scanny = new Scanner(System.in);

        System.out.println("What would you like to tell Bob?");
        String input = scanny.nextLine();

        if (input.endsWith("?")){
            System.out.println("Bob says: Sure.");
        } else if (input.endsWith("!")){
            System.out.println("Bob says: Whoa, chill out!");
        } else if (input.isEmpty()){
            System.out.println("Bob Says: Fine. Be that way!");
        } else {
            System.out.println("Bob says: Whatever");
        }

    }
}


