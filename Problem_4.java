//package AssignmentA;

import java.util.Scanner;

public class Problem_4 {

    // Method to count multiples of numbers 1 through 9 in the input array
    public static void countMultiples(int[] numbers) {
        // We will store counts for divisors 1 to 9 in an array index 0 to 8
        int[] counts = new int[9]; 

        // Loop through each divisor from 1 to 9
        for (int divisor = 1; divisor <= 9; divisor++) {
            int count = 0; // Count of numbers divisible by current divisor

            // Check each number in the input list
            for (int num : numbers) {
                if (num % divisor == 0) { // If divisible
                    count++;
                }
            }

            counts[divisor - 1] = count; // Save count for this divisor
        }

        // Print the results in the requested format
        System.out.println("{");
        for (int i = 1; i <= 9; i++) {
            System.out.println("  " + i + ": " + counts[i - 1] + (i < 9 ? "," : ""));
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter numbers separated by space
        System.out.println("Enter numbers separated by space:");

        // Read the entire line and split by spaces
        String line = scanner.nextLine();
        String[] parts = line.trim().split("\\s+");

        // Convert string input to int array
        int[] numbers = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }

        // Call method to count and print multiples
        countMultiples(numbers);

        scanner.close();
    }
}

