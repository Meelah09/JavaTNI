import javax.swing.*;

public class Ex301 {
    public static void main(String[] args) {
        double total_price = Double.parseDouble(JOptionPane.showInputDialog("Enter total price:"));

        int coupon = JOptionPane.showConfirmDialog(null, "Do you have coupon?", "Coupon", JOptionPane.YES_NO_OPTION);

        if (coupon == 0) { //if (coupon == JOptionPane.YES_OPTION)
            int discount_coupon = Integer.parseInt(JOptionPane.showInputDialog("How many discount(%)?"));
            double dicount = total_price * discount_coupon / 100;
            double pay = total_price - dicount;
            JOptionPane.showMessageDialog(null,
                    "You get discount " + dicount + "baht.\n" + "Total price is " + pay + " baht.");
        } else {
            if (total_price >= 1500) {
                double discount = total_price * 10 /100;
                double pay = total_price - discount;
                JOptionPane.showMessageDialog(null,"you get discount 10% (" +discount+ ")\n" +
                        "Total price is "+pay+"baht.");
            } else {
                JOptionPane.showMessageDialog(null, "Total price is " + total_price + " baht.");

            }

        }
    }
}

import javax.swing.*;

public class Lab401 {
    public static void main(String[] args) {
        String fullName;
        while (true) {
            fullName = JOptionPane.showInputDialog(null, "Enter your full name:");

            if (fullName == null) {   // กด Cancel
                return;
            }

            fullName = fullName.trim();

            // แยกชื่อ และนามสกุล
            String[] parts = fullName.split(" ");

            // ต้องมี 2 คำเท่านั้น
            if (parts.length == 2) {
                String firstName = parts[0];
                String lastName = parts[1];

                // คำแรกเป็นตัวอักษรล้วน และคำสองก็ต้องเป็นตัวอักษรล้วน
                if (firstName.matches("[a-zA-Z]+") && lastName.matches("[a-zA-Z]+")) {

                    // จัดรูปแบบตามโจทย์
                    String formattedFirst =
                            firstName.substring(0, 1).toUpperCase() +
                            firstName.substring(1).toLowerCase();

                    String formattedLast = lastName.toUpperCase();

                    JOptionPane.showMessageDialog(null,
                            "Welcome, " + formattedFirst + " " + formattedLast);
                    break;
                }
            }

            // ถ้ารูปแบบผิด
            JOptionPane.showMessageDialog(null, "Invalid full name, please try again.");
        }
    }
}

