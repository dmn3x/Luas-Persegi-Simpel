import java.util.Scanner;
public class SquareCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.print("Enter a number (or type 'exit' to quit): ");
            String userInput = scanner.next();

            if (userInput.equalsIgnoreCase("exit")) {
                continueCalculating = false;
            } else {
                try {
                    double number = Double.parseDouble(userInput);
                    double square = number * number;
                    System.out.println("The square of " + number + " is " + square);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number or 'exit'.");
                }
            }
        }

        // Remember to close the scanner!
        scanner.close();
        System.out.println("Thank you for using the Square Calculator!");
    }
}
