import java.util.Scanner;

public class Lab305 {
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

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = start; i <= end; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
