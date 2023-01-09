package util;

import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Please input a string: ");
        return scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String userString = getString("Please input yes or no");
        if (userString.equalsIgnoreCase("yes") ||userString.equalsIgnoreCase("y")){
            return true;
        }else {
            return false;
        }
    }

    public int getInt(int min, int max){
            System.out.print("Enter a number between "+min+" and "+max+": ");
            int userInput = scanner.nextInt();
         if (userInput < min || userInput > max){
             return getInt(min,max);
         }
        return userInput;
    }

    public int getInt(){
        System.out.print("Enter a whole number");
        int userInput = scanner.nextInt();
        return userInput;
    }

    public double getDouble(double min, double max){
        System.out.print("Enter a number between "+min+" and "+max+": ");
        double userInput = scanner.nextDouble();
        if (userInput < min || userInput > max){
            return getDouble(min,max);
        }
        return userInput;
    }



//    public double getDouble(double min, double max){
//        double userInput;
//        do {
//            System.out.print("Enter a double between "+min+" and "+max+": ");
//            userInput = this.scanner.nextDouble();
//        } while (!(userInput>= min) && !(userInput<=max));
//        return userInput;
//    }
//
//    public double getDouble() {
//        System.out.println("Enter a double: ");
//        return this.scanner.nextDouble();
//    }
//
//    public double getDouble(String prompt){
//        System.out.print(prompt);
//        return this.scanner.nextDouble();
//    }

}
