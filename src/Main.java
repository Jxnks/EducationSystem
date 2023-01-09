import java.util.ArrayList;
import java.util.Scanner;
import java.lang.NullPointerException;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Grades Grades = new Grades();
    Students s1 = new Students("Connor Jenkins", 18);

    ArrayList<Students> students = new ArrayList<>();

    while (true) {
        System.out.print("Enter your name, empty will stop: ");
        String name = scanner.nextLine();
        if (name.isEmpty()) {
            break;
        }
        System.out.print("Enter your age, 0 will stop: ");
        int age = Integer.parseInt(scanner.nextLine());
        if (age == 0) {
            break;
        }

        students.add(new Students(name, age));

    }
        for (Students student : students) {
            System.out.println(student.toString());
        }






/*
    UserInterface ui = new UserInterface(scanner ,students);
    //ui.start();
        ui.subjectPicker();
        */



}
}
