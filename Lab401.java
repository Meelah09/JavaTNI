import javax.swing.*;

public class Lab401 {
    public static void main(String[] args) {
        String fullName;
        boolean isValid = false;

        while (!isValid) {

            fullName = JOptionPane.showInputDialog(null, "Enter your full name:", "Input", JOptionPane.QUESTION_MESSAGE);

            if (fullName == null) {
                return;
            }

            String trimmedName = fullName.trim();
            String[] parts = trimmedName.split(" ");

            if (parts.length == 2 && !parts[0].isEmpty() && !parts[1].isEmpty()) {

                String firstName = parts[0];
                String lastName = parts[1];

                String formattedFirstName = formatName(firstName);

                String formattedLastName = lastName.toUpperCase();

                String message = "Welcome, " + formattedFirstName + " " + formattedLastName;
                JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);

                isValid = true; // ตั้งค่าให้หลุดออกจาก While Loop
            } else {
                JOptionPane.showMessageDialog(null, "Invalid name format. Please enter exactly a First Name and Last Name separated by one space (e.g., Jane Doe).", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    private static String formatName(String name) {
        if (name == null || name.isEmpty()) {
            return "";
        }
        String lowerCaseName = name.toLowerCase();

        String firstLetter = lowerCaseName.substring(0, 1).toUpperCase();

        String restOfName = lowerCaseName.substring(1);

        return firstLetter + restOfName;
    }
}
