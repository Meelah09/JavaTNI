import java.util.Scanner;

class 301{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int num = scanner.nextInt();
        
        if(num==0){
            System.out.println("This is Zero number. ");
        }
        else{
            String evenOdd = (num %2 == 0) ? "Even" : "Odd";

            String posNeg = (num > 0) ? "Positive" : "Negative";

            System.out.println("This number is " + evenOdd + " and " + posNeg + " number. ");
        }
        
    }
}

import java.util.Scanner;

class 305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first  number: ");
        int first = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();

        int start = first;
        int end = second;

        if (first > second) {
            start = second;
            end = first;
        }


        // แสดงผลลัพธ์ชุดแรก
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // ขึ้นบรรทัดใหม่

        for (int i = start; i <= end; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();


    }
}

import java.util.Scanner;

class 308 {
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

