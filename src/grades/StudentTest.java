package grades;


public class StudentTest {

    public static void main(String[] args) {

        Student Javier = new Student("Javier");

        Javier.addGrade(90);

        System.out.println("The student grade is " +Javier.getGradeAverage());


    }
}
