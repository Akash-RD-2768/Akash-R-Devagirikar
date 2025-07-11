//package AssignmentA;

import java.util.Scanner;

public class Problem_1 {
    private double a;
    private double b;

    // Constructor
    public Problem_1(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Calculator method
    public double calculate(String operation) {
        return switch (operation.toLowerCase()) {
            case "add" -> a + b;
            case "subtract" -> a - b;
            case "multiply" -> a * b;
            case "divide" -> (b != 0) ? a / b : Double.NaN;
            default -> Double.NaN;
        };
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter operation (add / subtract / multiply / divide): ");
        String operation = scanner.next();

        Problem_1 calculator = new Problem_1(a, b);
        double result = calculator.calculate(operation);

        if (Double.isNaN(result)) {
            System.out.println("Invalid operation or division by zero.");
        } else {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}

