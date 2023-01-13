package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> gitStudentName = new HashMap<>();

        Student Johnny = new Student("Johnny Depp");
        Johnny.addGrade(100);
        Johnny.addGrade(90);
        Johnny.addGrade(95);

        Student Brad = new Student("Brad Pitt");
        Brad.addGrade(85);
        Brad.addGrade(90);
        Brad.addGrade(85);

        Student Jackson = new Student("Michael Jackson");
        Jackson.addGrade(80);
        Jackson.addGrade(80);
        Jackson.addGrade(75);

        Student Jordan = new Student("Michael Jordan");
        Jordan.addGrade(100);
        Jordan.addGrade(100);
        Jordan.addGrade(100);

        Student Tony = new Student("Tony Hawk");
        Tony.addGrade(100);
        Tony.addGrade(90);
        Tony.addGrade(95);

        //this is for testing purposes to make sure averages are correct
//        System.out.println(Johnny.getGradeAverage());
//        System.out.println(Brad.getGradeAverage());
//        System.out.println(Jackson.getGradeAverage());
//        System.out.println(Jordan.getGradeAverage());
//        System.out.println(Tony.getGradeAverage());


        //the following is a step to put these into key value pairs.
        gitStudentName.put("EdwardScissorHands111", Johnny);
        gitStudentName.put("Achilles987", Brad);
        gitStudentName.put("Moonwalker78", Jackson);
        gitStudentName.put("AirJordan48", Jordan);
        gitStudentName.put("Birdman54", Tony);


        //stick the scanner in here
        Scanner scanner = new Scanner(System.in);



        String tryAgain = "";


        do{
            System.out.println("Here are the github names of students: ");
            System.out.println(gitStudentName.keySet());
            System.out.println("What student would you like to see more information on?");
            String userPick = scanner.next();

            if (userPick.equalsIgnoreCase("EdwardScissorHands111")) {

                System.out.println("Name: "+ gitStudentName.get("EdwardScissorHands111").getName() + "--" + "Github Username: EdwardScissorHands111");
                System.out.println("Current average grade: "+ gitStudentName.get("EdwardScissorHands111").getGradeAverage());

            } else if (userPick.equalsIgnoreCase("Achilles987")) {

                System.out.println("Name: " + gitStudentName.get("Achilles987").getName() + "--" + "Github Username: Achilles987");
                System.out.println("Current average grade: "+ gitStudentName.get("Achilles987").getGradeAverage());

            } else if (userPick.equalsIgnoreCase("Moonwalker78")) {
                System.out.println("Name: "+ gitStudentName.get("Moonwalker78").getName() + "--" + "Github Username: Moonwalker78");
                System.out.println("Current average grade: "+ gitStudentName.get("Moonwalker78").getGradeAverage());

            } else if (userPick.equalsIgnoreCase("AirJordan48")) {
                System.out.println("Name: "+ gitStudentName.get("AirJordan48").getName() + "--" + "Github Username: AirJordan48");
                System.out.println("Current average grade: "+ gitStudentName.get("AirJordan48").getGradeAverage());

            } else if (userPick.equalsIgnoreCase("Birdman54")) {
                System.out.println("Name: "+ gitStudentName.get("Birdman54").getName() + "--" + "Github Username: Birdman54");
                System.out.println("Current average grade: "+ gitStudentName.get("Birdman54").getGradeAverage());
            } else {
                scanner.next();
                System.out.println("Error, there is no user with this name");
            }
            System.out.println("Do you want to try again? (y/n)");
            tryAgain = scanner.next();


        } while (tryAgain.equalsIgnoreCase("y"));
        System.out.println("Laterz");


    }
}
