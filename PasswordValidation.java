import java.util.Scanner;

public class PasswordValidation {

    // Method to check if the password meets the required criteria
    public static boolean isValidPassword(String password) {
        // Check if the password has at least 8 characters
        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters long.");
            return false;
        }

        // Check if the password contains at least one digit
        if (!password.matches(".*\\d.*")) {
            System.out.println("Password must contain at least one number.");
            return false;
        }

        // Check if the password contains at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("Password must contain at least one uppercase letter.");
            return false;
        }

        // If all criteria are met, return true
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        // Loop to keep asking for the password until a valid one is entered
        while (true) {
            System.out.print("Enter your password: ");
            password = scanner.nextLine();

            // Check if the password is valid
            if (isValidPassword(password)) {
                System.out.println("Your password is valid!");
                break;  // Exit the loop if the password is valid
            } else {
                System.out.println("Please try again.");
            }
        }

        scanner.close();  // Close the scanner
    }
}
