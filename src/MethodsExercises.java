import java.util.Scanner;

public class MethodsExercises {
    Scanner scanny = new Scanner(System.in);

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




    public static void main (String[] args) {

        System.out.println(addition(4,4));
        System.out.println(subtraction(4,4));
        System.out.println(multiply(4,4));
        System.out.println(divide(10,5));


    }
}
