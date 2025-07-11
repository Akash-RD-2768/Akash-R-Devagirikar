//package AssignmentA;

import java.util.Scanner;

public class Problem_2 {
    // Variable to store the number of odd numbers to generate
    private int a;

    // Constructor to initialize 'a'
    public Problem_2(int a) {
        this.a = a;
    }  // <-- Closing brace added here

    // Method to generate and print the first 'a' odd numbers
    public void generateOddSeries() {
        int count = 0;    // Counter to keep track of how many odd numbers are printed
        int number = 1;   // Start from the first odd number

        // Loop until we have printed 'a' odd numbers
        while (count < a) {
            System.out.print(number + " "); // Print the current odd number followed by a space
            number += 2;                    // Move to the next odd number
            count++;                       // Increment the count of printed numbers
        }

        System.out.println(); // Print a newline after the series for clean output
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");  // Prompt the user to enter the value of 'a'
        int a = scanner.nextInt();      // Read the integer input

        // Create an instance of Problem_2 with the input value 'a'
        Problem_2 obj = new Problem_2(a);

        // Call the method to generate and print the odd number series
        obj.generateOddSeries();

        // Close the scanner to free system resources
        scanner.close();
    }
}
