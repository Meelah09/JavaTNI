import java.util.Scanner;

public class CakeOrder {
    public static void main(String[] arge){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birthday Cake's Details:");
        System.out.print("Enter a message on cake: ");
        String message = scanner.nextLine();
        System.out.print("Enter a flavor : ");
        String flavor = scanner.next();
        System.out.print("How many pounds: ");
        double pound = scanner.nextDouble();

        BirthdayCake order1 = new BirthdayCake(message,pound,flavor,350);

        System.out.println(order1);

        System.out.println("\nCup Cake's Details: ");
        System.out.print("Enter a flavor : ");
        String cup_flavor = scanner.next();
        System.out.print("How many pieces: ");
        int piece = scanner.nextInt();

        CupCake order2 = new CupCake(piece, cup_flavor,65);

        System.out.println(order2);

        System.out.println("\nTotal price = " + (order1.calculateTotalPrice()+ order2.calculateTotalPrice()));
    }
}
