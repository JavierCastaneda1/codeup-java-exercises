package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        Student Johnny = new Student("Johnny Depp");
        Johnny.addGrade(100);
        Johnny.addGrade(80);
        Johnny.addGrade(70);

        Student Brad = new Student("Brad Pitt");
        Brad.addGrade(50);
        Brad.addGrade(69);
        Brad.addGrade(98);

        Student Jackson = new Student("Michael Jackson");
        Jackson.addGrade(80);
        Jackson.addGrade(80);
        Jackson.addGrade(75);

        Student Jordan = new Student("Michael Jordan");
        Jordan.addGrade(72);
        Jordan.addGrade(54);
        Jordan.addGrade(100);

        Student Tony = new Student("Tony Hawk");
        Tony.addGrade(100);
        Tony.addGrade(99);
        Tony.addGrade(98);

        HashMap<String, Student> gitStudentName = new HashMap<>();

        gitStudentName.put("EdwardScissorHands111", Johnny);
        gitStudentName.put("Achilles987", Brad);
        gitStudentName.put("Moonwalker78", Jackson);
        gitStudentName.put("AirJordan48", Jordan);
        gitStudentName.put("Birdman54", Tony);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my application!");
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
