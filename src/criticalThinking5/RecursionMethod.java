package criticalThinking5;

import java.util.Scanner;

public class RecursionMethod {

    // Recursive method to calculate the product
    public static int product(int[] numbers, int index) {
        // Base case: if we've reached the end of the array
        if (index == numbers.length - 1) {
            return numbers[index];
        }
        //Recursive call to check the next number until product is found
        return numbers[index] * product(numbers, index + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Product calculated using recursion
        int result = product(numbers, 0);

        System.out.println("\nThe product of these numbers is: " + result);
        input.close();
    }
}

