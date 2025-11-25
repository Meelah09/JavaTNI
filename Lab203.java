import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter product id : ");
        String id = sc.next();

        System.out.print("Enter product name: ");
        String name = sc.next();

        System.out.print("Enter product item: ");
        int item = sc.nextInt();

        System.out.print("Enter price per piece: ");
        double price = sc.nextDouble();

        DecimalFormat frm = new DecimalFormat("#,###.00");

        double total_price = item * price;

        System.out.println();
        System.out.println("Product name: " + name + "(" + id + ")");
        System.out.println("Product item: " + item + "(" + frm.format(price) +" baht/piece)");
        System.out.println("Total price : " + frm.format(total_price) + " baht");


    }
}
