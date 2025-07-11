//package AssignmentA;

import java.util.Scanner;

public class Problem_3 {
    // Variable to hold the input number 'a'
    private int a;

    // Constructor to initialize 'a'
    public Problem_3(int a) {
        this.a = a;
    }

    // Method to generate and print the pattern based on 'a'
    public void generatePattern() {
        // If 'a' is even, reduce count by 1; else use 'a' itself
        int count = (a % 2 == 0) ? a - 1 : a;

        int number = 1; // Starting with the first odd number

        // Loop 'count' times to print odd numbers
        for (int i = 0; i < count; i++) {
            System.out.print(number + " "); // Print current odd number
            number += 2;                    // Move to the next odd number
        }

        System.out.println(); // Move to the next line after printing the series
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: "); // Prompt user for input
        int a = scanner.nextInt();     // Read input value

        // Create an instance of Problem_3 with input 'a'
        Problem_3 obj = new Problem_3(a);

        // Call the method to print the odd number pattern
        obj.generatePattern();

        scanner.close(); // Close the scanner to avoid resource leak
    }
}

