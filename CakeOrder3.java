import javax.swing.*;

public class CakeOrder3 {

    public static void main(String[] args) {

        double pound = Double.parseDouble(
                JOptionPane.showInputDialog("How many pounds do you want?")
        );
        String flavor = JOptionPane.showInputDialog(
                "Enter a flavor birthday cake:"
        );
        String message = JOptionPane.showInputDialog(
                "Enter a message on cake:"
        );

        double total = pound * 400;

        while (true) {
            int result = JOptionPane.showConfirmDialog(
                    null,
                    "Thank you for your order!\n"
                            + flavor + " birthday cake (message=" + message + ")\n"
                            + "Total price of Birthday Cake = " + total
                            + "\n\nConfirm this order?",
                    "Select an Option",
                    JOptionPane.YES_NO_CANCEL_OPTION
            );

            if (result == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(
                        null,
                        "Thank you for your order!\n"
                                + flavor + " birthday cake (message=" + message + ")\n"
                                + "Total price of Birthday Cake = " + total
                );
                break;
            } else {
                message = JOptionPane.showInputDialog(
                        "Enter a new message for changing:"
                );
            }
        }
    }
}

