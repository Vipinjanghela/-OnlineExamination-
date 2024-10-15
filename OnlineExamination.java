import java.util.Scanner;

public class OnlineExamination {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // User data
            String username = "";
            String password = "";

            // Login loop
            boolean loggedIn = false;
            while (!loggedIn) {
                System.out.print("Username: ");
                username = scanner.nextLine();
                System.out.print("Password: ");
                password = scanner.nextLine();

                // Check if login credentials are correct
                if (username.equals("user") && password.equals("password")) {
                    loggedIn = true;
                    System.out.println("Login successful!");
                } else {
                    System.out.println("Invalid username or password. Please try again.");
                }
            }

            // Main menu
            while (loggedIn) {
                System.out.println("\nMain Menu:");
                System.out.println("1. Update Profile");
                System.out.println("2. Take Exam");
                System.out.println("3. Logout");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                switch (choice) {
                    case 1:
                        // Update Profile logic here
                        System.out.println("Update Profile functionality not implemented yet.");
                        break;
                    case 2:
                        // Take Exam logic here
                        System.out.println("Take Exam functionality not implemented yet.");
                        break;
                    case 3:
                        loggedIn = false;
                        System.out.println("Logged out successfully!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }

            scanner.close();
        }

}
