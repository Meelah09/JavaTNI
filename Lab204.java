import java.util.Scanner;

public class Lab204 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input hour : ");
        int hours = scanner.nextInt();
        System.out.print("Input minute : ");
        int minute = scanner.nextInt();

        int totalMinute = (hours * 60)+minute;

        System.out.println("Total time is "+ totalMinute +" minutes");

    }
}
