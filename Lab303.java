import java.util.Scanner;

public class Lab303 {
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

    }
}
