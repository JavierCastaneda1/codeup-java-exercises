import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args){

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[2]); //this one spits out the "i" indexed out.
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Bro");
        people[1] = new Person("Guy");
        people[2] = new Person("Dude");

        for (Person person : people) {
            System.out.println(person.getName());
        }

//        for (Person person : people) {
//            System.out.println(person.getName());
//        }








    }

}
