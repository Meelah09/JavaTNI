import java.util.Scanner;

public class Lab308 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many number to input: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Invalid input. Please enter a positive number of inputs.");
            scanner.close();
            return;
        }

        int maximum = 0;
        int minimum = 0;
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 1; i <= N; i++) {
            System.out.print("Enter number " + i + ": ");
            int currentNumber = scanner.nextInt();

            if (i == 1) {
                maximum = currentNumber;
                minimum = currentNumber;
            } else {

                if (currentNumber > maximum) {
                    maximum = currentNumber;
                }

                if (currentNumber < minimum) {
                    minimum = currentNumber;
                }
            }

            if (currentNumber % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("\nMaximum = " + maximum);
        System.out.println("Minimum = " + minimum);
        System.out.println("Even number = " + evenCount);
        System.out.println("Odd number = " + oddCount);
    }
}
