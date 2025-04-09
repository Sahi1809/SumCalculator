import java.util.Scanner; // Import Scanner class for user input
public class SumCalculator {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for first number
        System.out.print("Enter first number (A): ");
        double a = scanner.nextDouble();
        
        // Prompt user for second number
        System.out.print("Enter second number (B): ");
        double b = scanner.nextDouble();
        
        // Calculate sum
        double sum = a + b;
        
        // Display result
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
        
        // Close scanner
        scanner.close();
    }
}