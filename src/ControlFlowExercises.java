
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main (String[] args){

        Scanner scanny = new Scanner(System.in);

////    EXERCISE 1 (WHILE LOOP)
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is: " +i);
//            i++;
//        }

////        EXERCISE 2 (DO WHILE LOOP)
//        int number = 0;
//        do {
//            System.out.println("List Number: "+number);
//            number += 2;
//        } while (number <= 100);

        //        EXERCISE 3 (DO WHILE REVERSE)
//        int number = 105;
//        do {
//            System.out.println(number -= 5);
//        } while (number > -10);

//        EXERCISE 4 (DO WHILE LOOP)

//        long num = 2;
//        do {
//            System.out.println(num);
//            num *= num;
//        } while (num < 1000000);

//        EXERCISE 5 (FOR LOOP VERSIONS)
//        for(int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }

//        FOR LOOP VERSION
//        for(int i = 2; i <= 100; i+=2) {
//            System.out.println(i);
//        }

//        for(int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }

//        FIZZ BUZZ

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else {
                System.out.println(i);
            }
        }

//        TABLE EXERCISE
//            String confirm;
//            do {
//                System.out.println("Enter the ending number for your table: ");
//                int input = scanny.nextInt();
//                System.out.println("Number\tSquared\tCubed");
//                System.out.println("------\t-------\t-----");
//                for (int i = 1; i <= input; i++) {
//                    System.out.println(i + "\t\t" + i * i + "\t\t" + i * i * i);
//                }
//                System.out.println("Would you like to try again? yes or no?");
//                confirm = scanny.next();
//            }
//            while (confirm.equals("yes"));

//        LETTER GRADES EXERCISE
//        String confirm;
//        do {
//            System.out.println("Enter a number grade for your score! (0-100)");
//            int grade = scanny.nextInt();
//
//            if (grade >= 90) {
//                System.out.println("A");
//            } else if (grade >= 80) {
//                System.out.println("B");
//            } else if (grade >= 70) {
//                System.out.println("C");
//            } else if (grade >= 60) {
//                System.out.println("D");
//            } else {
//                System.out.println("F");
//            }
//            System.out.println("Would you like to try again? yes or no?");
//                confirm = scanny.next();
//                confirm = confirm.toLowerCase();
//        }
//        while (Objects.equals(confirm, "yes"));



    }
}
