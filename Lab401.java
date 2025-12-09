import javax.swing.*;

public class Lab401 {
    public static void main(String[] args) {
        String fullName;
        while (true) {
            fullName = JOptionPane.showInputDialog(null, "Enter your full name:");

            if (fullName == null) {
                return;
            }

            fullName = fullName.trim();

            String[] parts = fullName.split(" ");


            if (parts.length == 2) {
                String firstName = parts[0];
                String lastName = parts[1];


                if (firstName.matches("[a-zA-Z]+") && lastName.matches("[a-zA-Z]+")) {

                    String formattedFirst =
                            firstName.substring(0, 1).toUpperCase() +
                                    firstName.substring(1).toLowerCase();

                    String formattedLast = lastName.toUpperCase();

                    JOptionPane.showMessageDialog(null,
                            "Welcome, " + formattedFirst + " " + formattedLast);
                    break;
                }
            }

            JOptionPane.showMessageDialog(null, "Invalid full name, please try again.");
        }

    }
}
