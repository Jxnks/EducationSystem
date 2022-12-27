import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Students students = new Students();

    UserInterface ui = new UserInterface(scanner /* ,students*/);
    ui.start();
}
}
