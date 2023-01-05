import java.util.Scanner;
public class MethodsLecture {
    public static Scanner scanny = new Scanner(System.in);
    public static String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }

    public static void printHello(String name) {
        System.out.printf("Hello, %s!%n", name);
    }

    public static String sayHello(){
        return "Hello, there";
    }

    public static void sayHello(int times){
        for (int i = 0; i < times; i += 1) {
            System.out.println(sayHello());
        }
    }

    public static void changeName(String name){
        name = "POSEIDON, LORD OF THE OCEAN...and ponies";
    }

    public static void areWeThereYet() {
        System.out.println("Are we there yet?");
        String resp = scanny.nextLine();
        if (!resp.equalsIgnoreCase("yes")){
            areWeThereYet();
        }
    }

    public static void main(String[] args){
        sayHello(5);
        System.out.println(sayHello());
        System.out.println(sayHello("Mr Bigglesworth"));
        String name = "David";
        System.out.println(name);
        changeName(name);
        System.out.println(name);
        areWeThereYet();


    }
}
