package grades;
import java.util.ArrayList;


public class Student {

    private String name;
    private ArrayList<Integer> grades;


    //this is your constructor
    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    //these are your methods
    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        int total = 0;
        for(int i = 0; i < grades.size(); i++){
            total += grades.get(i);
        }
        return total / grades.size();

    }


}
