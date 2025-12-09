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

import javax.swing.*;

class 302 {
    public static void main(String[] args) {
        String name = "";
        double height_cm = 0;
        double standardWeight = 0;
        String genderPrefix = "";

        try {
            
            String nameInput = JOptionPane.showInputDialog(null,
                    "Enter your name:",
                    "Input",
                    JOptionPane.QUESTION_MESSAGE);

            if (nameInput == null || nameInput.trim().isEmpty()) {
                name = "User";
            } else {
                name = nameInput.trim();
            }

            
            String heightInput = JOptionPane.showInputDialog(null,
                    "Enter your height (cm.):",
                    "Input",
                    JOptionPane.QUESTION_MESSAGE);

            if (heightInput == null) return; // ผู้ใช้ยกเลิก
            height_cm = Double.parseDouble(heightInput);

           
            int maleOption = JOptionPane.showConfirmDialog(null,
                    "Are your biological gender is Male?",
                    "Gender",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

          
            if (maleOption == JOptionPane.YES_OPTION) {
               
                standardWeight = height_cm - 100;
                genderPrefix = "Mr.";

                // แสดงผลลัพธ์ผู้ชาย
                String message = "Hello, " + genderPrefix + name + "\n"
                        + "If your height is " + String.format("%.1f", height_cm) + " cm.\n"
                        + "Your weight should be " + String.format("%.1f", standardWeight) + " kg.";

                JOptionPane.showMessageDialog(null,
                        message,
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);

            } else {
                
                int femaleOption = JOptionPane.showConfirmDialog(null,
                        "Are your biological gender is Female?",
                        "Gender",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);

                if (femaleOption == JOptionPane.YES_OPTION) {
                 
                    standardWeight = height_cm - 110;
                    genderPrefix = "Ms.";

                    // แสดงผลลัพธ์ผู้หญิง
                    String message = "Hello, " + genderPrefix + name + "\n"
                            + "If your height is " + String.format("%.1f", height_cm) + " cm.\n"
                            + "Your weight should be " + String.format("%.1f", standardWeight) + " kg.";

                    JOptionPane.showMessageDialog(null,
                            message,
                            "Message",
                            JOptionPane.INFORMATION_MESSAGE);

                } else {
                    
                    JOptionPane.showMessageDialog(null,
                            "You can use BMI to measure your weight and height.",
                            "Message",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }

        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null,
                    "Invalid input. Please enter a valid number for height.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        
    }
}

import java.util.Scanner;

 class Lab303 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value for X coordinate: ");
        int X = scanner.nextInt();
        
        System.out.print("Enter the value for Y coordinate: ");
        int Y = scanner.nextInt();

        String position = "";

        // 3. ตรวจสอบเงื่อนไข
        if (X == 0 && Y == 0) {
            position = "Origin";
        } else if (X == 0) {
            position = "Y-axis";
        } else if (Y == 0) {
            position = "X-axis";
        } else if (X > 0 && Y > 0) {
            position = "First quadrant";
        } else if (X < 0 && Y > 0) {
            position = "Second quadrant";
        } else if (X < 0 && Y < 0) {
            position = "Third quadrant";
        } else { 
            position = "Fourth quadrant";
        }
        
        System.out.println("The coordinate point (" + X + "," + Y + ") lies in the " + position);

        scanner.close();
    }
}


