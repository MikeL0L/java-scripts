import java.util.Scanner;
// To allow user input

// Arithmetic interface
interface Arithmetic {
    double sum();
    double diff();
    double prod();
    double quo();
}

// Arithmetic interface in the ArithmeticValue class
class ArithmeticValue implements Arithmetic {
    private double num1, num2;

    // Method for user input
    private void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();
    }

    // Implement sum() method
    public double sum() {
        getInput();  // Get the user input for the sum method
        return num1 + num2;
    }

    // Implement diff() method
    public double diff() {
        getInput();  // Get the user input for the diff method
        return num1 - num2;
    }

    // Implement prod() method
    public double prod() {
        getInput();  // Get the user input for the prod method
        return num1 * num2;
    }

    // Implement quo() method
    public double quo() {
        getInput();  // Get the user input for the quo method
        return num1 / num2;
    }
}

public class CS225D_Cabot_Interface {
    public static void main(String[] args) {

        // Create an object of ArithmeticValue class
        ArithmeticValue arithmeticValue = new ArithmeticValue();

        // results
        System.out.println("Sum: " + arithmeticValue.sum());
        System.out.println("Difference: " + arithmeticValue.diff());
        System.out.println("Product: " + arithmeticValue.prod());
        System.out.println("Quotient: " + arithmeticValue.quo());

    }
}
