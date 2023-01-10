import java.util.ArrayList;

public class Students{
    private String name;
    private Grades grades;
    private int age;
    private ArrayList<String> studentList;



    // constructor
    public Students(String name, int age) {
        this.name = name;
        this.age = age;
        this.studentList = new ArrayList<>();
        this.grades = new Grades();
    }

    public Students() {
        this.studentList = new ArrayList<>();
        this.grades = new Grades();
    }

    public Students(String name) {
        this.name = name;
        this.studentList = new ArrayList<>();
        this.grades = new Grades();
    }


    public void getDetails() {
        getName();
        getAge();
        getGrades();
        System.out.println("");
    }

    public String getName() {
        System.out.println(this.name);
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public int getAge() {
        System.out.println(this.age);
        return this.age;
    }

    public void getGrades() {
        this.grades.getMathsGrade();
        this.grades.getEnglishGrade();
    }

    public void add(Students student){
        ArrayList<Students> students = new ArrayList<>();
        students.add(student);
    }


    public void setEnglishGrade(int engGrade) {
        this.grades.setEnglishGrade(engGrade);
    }


    public void setMathsGrade(int mathsGrade) {
        this.grades.setMathsGrade(mathsGrade);
    }


    public void getMathsGrade() {
        this.grades.getMathsGrade();
    }

    public void getEnglishGrade() {
        this.grades.getEnglishGrade();
    }

    public void setGrades(int mathsGrade, int englishGrade) {
        this.grades.setGrades(mathsGrade, englishGrade);
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", age: " + this.age + " years ";
    }
}
