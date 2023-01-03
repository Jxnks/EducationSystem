import java.util.ArrayList;

public class Students{
    private String name;
    private Grades studentGrades;
    private int age;
    private ArrayList<String> studentList;
    private int engGrade;



    // constructor
    public Students(String name, int age) {
        this.name = name;
        this.age = age;
        this.studentList = new ArrayList<>();
        this.engGrade = 0;
    }

    public void setEnglishGrade(int engGrade) {
        this.studentGrades.setEnglishGrade(engGrade);
    }

    public void setEnglishGrade2(int engGrade) {
      //  this.studentGrades.setEnglishGrade(engGrade);
        this.engGrade = engGrade;
    }

    public void setMathsGrade(int mathsGrade) {
        this.studentGrades.setMathsGrade(mathsGrade);
    }

    public int getMathsGrade() {
        return this.getMathsGrade();
    }

    public int getEngGrade() {
        System.out.println(this.engGrade);
        return this.engGrade;

    }
}
