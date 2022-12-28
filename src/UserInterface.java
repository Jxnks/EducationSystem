import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.lang.*;

public class UserInterface {

    final Scanner scanner;
    //final Students studentDetails;

    public UserInterface(Scanner scanner/*, Students studentDetails*/) {
        this.scanner = scanner;
        //this.studentDetails = studentDetails;
    }

    public void start() {
        welcomeScreen();
        studentName();
        studentAge();
        subjectPicker();

    }

//work
    public void staffLogCredentials(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Username:");
        String input = scanner.nextLine();
        System.out.println("Password");
        String input2 = scanner.nextLine();

    }

    //work
    public void staffIntranet(){
        staffLogCredentials();
        System.out.println("");
    }



    public void welcomeScreen() {
        System.out.println("Hello and welcome to Dordon Community College.\n" +
                "You can learn multiple trades or join our amazing programming bootcamp." +
                "Press 1 to apply for enrollment." +
                "Press 2 for the staff intranet"
        );
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 1) {
                break;
            } else if (input == 2) {
                staffIntranet();
            }
        }

    }


    public void studentAge() {
        while (true) {
            System.out.println("Enter date of birth in YYYY-MM-DD format: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            LocalDate dob = LocalDate.parse(input);
            System.out.println("You are " + Calculators.calculateAge(dob) + " years old. Is this correct?\ny/n?");
            //Calculators.yesOrNo();
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
                            }

                        }
                    }



                }







