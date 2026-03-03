import java.util.Scanner;

public class CakeOrder2 {
    public static String selectFlavor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPress 1 for Chocolate");
        System.out.println("Press 2 for Vanilla");
        System.out.println("Press 3 for Strawberry");
        System.out.println("Press 4 for Lemon");
        System.out.println("Press 5 for Red Velvet");

        int choice;
        String flavor = "";

        while (true) {
            System.out.print("Enter a flavor number: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    flavor = "Chocolate";
                    break;
                case 2:
                    flavor = "Vanilla";
                    break;
                case 3:
                    flavor = "Strawberry";
                    break;
                case 4:
                    flavor = "Lemon";
                    break;
                case 5:
                    flavor = "Red Velvet";
                    break;
                default:
                    continue;
            }
            break;
        }
        return flavor;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 to order Birthday Cake");
        System.out.println("Press 2 to order Cup Cake");
        System.out.print("Enter an option: ");

        int option = sc.nextInt();
        sc.nextLine();

        if (option == 1) {
            String flavor = selectFlavor();

            System.out.print("\nEnter a message: ");
            String message = sc.nextLine();

            System.out.print("How many pounds: ");
            double pound = sc.nextDouble();

            BirthdayCake cake =
                    new BirthdayCake(message, pound, flavor, 350);

            System.out.println(cake);

        } else if (option == 2) {
            String flavor = selectFlavor();

            System.out.print("\nHow many pieces: ");
            int piece = sc.nextInt();

            CupCake cupCake =
                    new CupCake(piece, flavor, 70);


            System.out.println(cupCake);

        } else {
            System.out.println("\nWrong option!! Try again!!\n");
        }
    }
}



