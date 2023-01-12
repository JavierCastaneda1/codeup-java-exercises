package grades;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }


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

        for (Integer grade : this.grades) {
            total += grade;
        }
        return (double)total / (double)this.grades.size();
    }


}
