import javax.swing.*;
import java.text.DecimalFormat;

public class Lab206 {
    public static void main(String[] args) {

        final double price = 299.0;
        final double vat = 0.07;
        DecimalFormat frm = new DecimalFormat("#,###.00");

        int customer = Integer.parseInt(JOptionPane.showInputDialog("How many customer?"));

        double total = price * customer;

        double net = total + (total * vat);

        String msg1 = "Price with NET is " + frm.format(net) + " baht.\n"
                + "How much of discount (%) on your coupon?";
        double discount = Double.parseDouble(JOptionPane.showInputDialog(msg1));

        double finalPrice = net - (net * discount / 100);

        String msg2 = "Total price is " + frm.format(finalPrice) + " baht.\n"
                + "Enter the amount the customer paid:";
        double paid = Double.parseDouble(JOptionPane.showInputDialog(msg2));


        double change = paid - finalPrice;


        String msg3 = "Total price is " + frm.format(finalPrice) + " baht.\n"
                + "Customer paid " + frm.format(paid) + " baht.\n"
                + "Get change " + frm.format(change) + " baht.";

        JOptionPane.showMessageDialog(null, msg3);
    }
}

