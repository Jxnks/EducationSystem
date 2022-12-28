import java.nio.channels.ScatteringByteChannel;
import java.time.LocalDate;
import java.time.Period;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

public class Calculators {
    //private static Object IOException;
    private LocalDate dob;

    //constructor
    public static int calculateAge(LocalDate dob) {
        //creating an instance of the LocalDate class and invoking the now() method
        //now() method obtains the current date from the system clock in the default time zone
        LocalDate currentDate = LocalDate.now();
        //calculates the amount of time between two dates and returns the years
        // need to look at error handling of this code!
        if ((dob != null) && (currentDate != null))
        {
            return Period.between(dob, currentDate).getYears();
        }
        else
        {
            System.out.println("There has been an error."); // work on error handling
            return 0;
        }
    }

    public static void youHaveChosen(String chosen) {
        System.out.println("you have chosen " + chosen + ". is this correct? y/n?");
    }


    public static void yesOrNo(){
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.toLowerCase(Locale.ROOT).contains("y")) {
                break;
            } else if (input.toLowerCase(Locale.ROOT).contains("n")) {
                System.out.println("There appears to be an error. Lets try again.");
                break;
            }
        }
    }
}