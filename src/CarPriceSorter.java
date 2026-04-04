import java.util.Scanner;

public class CarPriceSorter {

    // Method to perform Bubble Sort on the array
    public static void bubbleSort(int[] carPrices) {
        int length = carPrices.length;

        // Outer loop → number of passes
        for (int i = 0; i < length - 1; i++) {

            // Inner loop → compare adjacent elements
            for (int j = 0; j < length - i - 1; j++) {

                // If current value is greater than next → swap
                if (carPrices[j] > carPrices[j + 1]) {

                    int temp = carPrices[j];           // store value temporarily
                    carPrices[j] = carPrices[j + 1];   // move smaller value left
                    carPrices[j + 1] = temp;           // place larger value right
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Step 1: Ask user for number of car prices
        System.out.print("Enter number of car prices: ");
        int size = input.nextInt();

        // Step 2: Create array based on user input
        int[] carPrices = new int[size];

        System.out.println("Enter the car prices:");

        // Step 3: Take input with basic validation
        for (int i = 0; i < size; i++) {

            System.out.print("Price " + (i + 1) + ": ");

            // Check for valid integer input
            while (!input.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid number.");
                input.next(); // clear invalid input
                System.out.print("Price " + (i + 1) + ": ");
            }

            carPrices[i] = input.nextInt();
        }

        // Display prices before sorting
        System.out.println("\nPrices before sorting:");
        for (int price : carPrices) {
            System.out.print(price + " ");
        }

        // Step 4: Call Bubble Sort method
        bubbleSort(carPrices);

        // Display prices after sorting
        System.out.println("\nPrices after sorting (ascending order):");
        for (int price : carPrices) {
            System.out.print(price + " ");
        }

       
    }
}