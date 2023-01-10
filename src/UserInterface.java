import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.lang.*;

public class UserInterface {

    private Scanner scanner;
    //final Students studentDetails;

    public UserInterface(Scanner scanner/*, Students studentDetails*/) {
        this.scanner = scanner;
        //this.studentDetails = studentDetails;
    }

    public UserInterface() {

    }

    public void start() {
        welcomeScreen();
    }

//work to be done
    public void staffLogCredentials(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Username:");
        String input = scanner.nextLine();
        System.out.println("Password");
        String input2 = scanner.nextLine();

    }

    public void enrollmentSystem() {

        int maxStudentsInCollege = 96; // 24 per class
        for(int i = 0; i < maxStudentsInCollege; i++) {

            System.out.println("To exit this program type 'exit'");
            String command = scanner.nextLine();
            if (command.contains("exit")) {
                break;
            }

            ArrayList<Students> studentList = new ArrayList<>();
            ArrayList<Students> electricalStudents = new ArrayList<>();
            ArrayList<Students> carpentryStudents = new ArrayList<>();
            ArrayList<Students> plumbingStudents = new ArrayList<>();
            ArrayList<Students> programmingStudents = new ArrayList<>();
            Grades Grades = new Grades();
            Students student = new Students();



            // age calculator

                // name
                System.out.println("Please enter your full name (including any middle names):");
                String fullName = scanner.nextLine();
                student.setName(fullName);

                System.out.println("Enter date of birth in YYYY-MM-DD format: ");
                Scanner scanner = new Scanner(System.in);
                String dobInput = scanner.nextLine();
                LocalDate dob = LocalDate.parse(dobInput); // calculate age from dob
                System.out.println("You are " + Calculators.calculateAge(dob) + " years old. Is this correct?\ny/n?");
                String ynInput = scanner.nextLine();

                if (Calculators.calculateAge(dob) < 18) {
                    System.out.println("Sorry, you are currently too young to enter this college. Please try again when you are 18.");
                    break;
                } else if (ynInput.toLowerCase(Locale.ROOT).contains("n")) {
                    System.out.println("There appears to be an error. Lets try again.");
                }
                if (ynInput.toLowerCase(Locale.ROOT).contains("y")) {
                    student.setAge(Calculators.calculateAge(dob));
                    studentList.add(student);
                }

                System.out.println("What is your Maths grade?");
                int mathsGrade = Integer.parseInt(scanner.nextLine());
                System.out.println("What is your English grade?");
                int engGrade = Integer.parseInt(scanner.nextLine());
                student.setGrades(mathsGrade, engGrade);



                // subject picker

                System.out.println("What subject would you like to study?\nPress 1 for Electrical Installation.\nPress 2 for Carpentry.\n" +
                        "Press 3 for Plumbing.\n" + "Press 4 for Java programming bootcamp.");
                int subjectInput = Integer.parseInt(scanner.nextLine());

                if (subjectInput == 1) {
                    Calculators.youHaveChosen("Electrical Installation");
                    String yesOrNo = scanner.nextLine();
                    if (yesOrNo.toLowerCase(Locale.ROOT).contains("y")) {
                        electricalStudents.add(student);
                        for (Students e : electricalStudents){
                            System.out.println(e.toString());
                        }
                    } else if (yesOrNo.toLowerCase(Locale.ROOT).contains("n")) {
                        System.out.println("There appears to be an error. Lets try again.");

                    }
                } else if (subjectInput == 2) {
                    Calculators.youHaveChosen("Carpentry.");
                    String input2 = scanner.nextLine();
                    if (input2.toLowerCase(Locale.ROOT).contains("y")) {
                        carpentryStudents.add(student);

                    } else if (input2.toLowerCase(Locale.ROOT).contains("n")) {
                        System.out.println("There appears to be an error. Lets try again.");
                    }
                } else if (subjectInput == 3) {
                    Calculators.youHaveChosen("Plumbing.");
                    String input2 = scanner.nextLine();
                    if (input2.toLowerCase(Locale.ROOT).contains("y")) {
                        plumbingStudents.add(student);

                    } else if (input2.toLowerCase(Locale.ROOT).contains("n")) {
                        System.out.println("There appears to be an error. Lets try again.");
                    }
                } else if (subjectInput == 4) {
                    Calculators.youHaveChosen("Java programming bootcamp.");
                    String input2 = scanner.nextLine();
                    if (input2.toLowerCase(Locale.ROOT).contains("y")) {
                        programmingStudents.add(student);

                    } else if (input2.toLowerCase(Locale.ROOT).contains("n")) {
                        System.out.println("There appears to be an error. Lets try again.");
                    }
                } else {
                    System.out.println("You have not chosen a valid option. Please try again.");
                }

            }

        }



    //work to be done
    public void staffIntranet() {
        staffLogCredentials();
        System.out.println("");
    }





    public void welcomeScreen() {
        System.out.println("Hello and welcome to Dordon Community College.\n" +
                "You can learn multiple trades or join our amazing programming bootcamp." +
                "Press 1 to apply for enrollment." +
                "Press 2 for the staff intranet"
        );

            Scanner scanner = new Scanner(System.in);
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 1) {
                enrollmentSystem();
            } else if (input == 2) {
                staffIntranet();
            }
        }

    }

    /* not in use, used to have them broken up but to add the student to a list I did it in one big block of code

    public void studentAge() {
        while (true) {
            System.out.println("Enter date of birth in YYYY-MM-DD format: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            LocalDate dob = LocalDate.parse(input);
            System.out.println("You are " + Calculators.calculateAge(dob) + " years old. Is this correct?\ny/n?");

            String input2 = scanner.nextLine();
            if (input2.toLowerCase(Locale.ROOT).contains("y")) {
                if (Calculators.calculateAge(dob) < 18) {
                    System.out.println("Sorry, you are currently too young to enter this college. Please try again when you are 18.");
                }
                break; // could use this to calculate required age ^^
            } else if (input2.toLowerCase(Locale.ROOT).contains("n")) {
                System.out.println("There appears to be an error. Lets try again.");
            }

        }

    }



    public void studentName() {


        System.out.println("Please enter your full name (including any middle names):");
        String fullName = scanner.nextLine();
    }

    public void subjectPicker() {
        while (true) {
            System.out.println("What subject would you like to study?\nPress 1 for Electrical Installation.\nPress 2 for Carpentry.\n" +
                    "Press 3 for Plumbing.\n" + "Press 4 for Java programming bootcamp.");
            Scanner scanner = new Scanner(System.in);
            int input = Integer.parseInt(scanner.nextLine());

            if (input == 1) {
                Calculators.youHaveChosen("Electrical Installation");
                String input2 = scanner.nextLine();
                if (input2.toLowerCase(Locale.ROOT).contains("y")) {
                    break;
                } else if (input2.toLowerCase(Locale.ROOT).contains("n")) {
                    System.out.println("There appears to be an error. Lets try again.");
                }
            } else if (input == 2) {
                Calculators.youHaveChosen("Carpentry.");
                String input2 = scanner.nextLine();
                if (input2.toLowerCase(Locale.ROOT).contains("y")) {
                    break;
                } else if (input2.toLowerCase(Locale.ROOT).contains("n")) {
                        System.out.println("There appears to be an error. Lets try again.");
                    }
            } else if (input == 3) {
                Calculators.youHaveChosen("Plumbing.");
                String input2 = scanner.nextLine();
                if (input2.toLowerCase(Locale.ROOT).contains("y")) {
                    break;
                } else if (input2.toLowerCase(Locale.ROOT).contains("n")) {
                    System.out.println("There appears to be an error. Lets try again.");
                }
            } else if (input == 4) {
                Calculators.youHaveChosen("Java programming bootcamp.");
                String input2 = scanner.nextLine();
                if (input2.toLowerCase(Locale.ROOT).contains("y")) {
                    break;
                } else if (input2.toLowerCase(Locale.ROOT).contains("n")) {
                    System.out.println("There appears to be an error. Lets try again.");
                }
            } else {
                System.out.println("You have not chosen a valid option. Please try again.");
                */









