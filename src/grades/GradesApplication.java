package grades;

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


    }
}
