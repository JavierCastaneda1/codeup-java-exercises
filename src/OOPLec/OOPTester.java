package OOPLec;

import java.util.Scanner;

public class OOPTester {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(Person.breathes);

        Person david = new Person("David", "6 foot");
        david.setName("Lord Megatron David Stephens");
        david.setHeight("1 Million feet");
        System.out.println(david.getName());
        System.out.println(david.getHeight());

        Person ana = new Person("Ana", "5 foot, 7 inches");
        System.out.println(ana.getName());
        System.out.println(ana.getHeight());



        System.out.println(david);


    }
}
