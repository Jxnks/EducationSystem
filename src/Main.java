import java.util.ArrayList;
import java.util.Scanner;
import java.lang.NullPointerException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(scanner);
        ui.start();
}
}
