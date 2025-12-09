import javax.swing.*;

public class Lab302 {
    public static void main(String[] args) {
        String name = "";
        double height_cm = 0;
        double standardWeight = 0;
        String genderPrefix = "";

        try {

            String nameInput = JOptionPane.showInputDialog(null,
                    "Enter your name:",
                    "Input",
                    JOptionPane.QUESTION_MESSAGE);

            if (nameInput == null || nameInput.trim().isEmpty()) {
                name = "User";
            } else {
                name = nameInput.trim();
            }


            String heightInput = JOptionPane.showInputDialog(null,
                    "Enter your height (cm.):",
                    "Input",
                    JOptionPane.QUESTION_MESSAGE);

            if (heightInput == null) return; // ผู้ใช้ยกเลิก
            height_cm = Double.parseDouble(heightInput);


            int maleOption = JOptionPane.showConfirmDialog(null,
                    "Are your biological gender is Male?",
                    "Gender",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);


            if (maleOption == JOptionPane.YES_OPTION) {

                standardWeight = height_cm - 100;
                genderPrefix = "Mr.";

                // แสดงผลลัพธ์ผู้ชาย
                String message = "Hello, " + genderPrefix + name + "\n"
                        + "If your height is " + String.format("%.1f", height_cm) + " cm.\n"
                        + "Your weight should be " + String.format("%.1f", standardWeight) + " kg.";

                JOptionPane.showMessageDialog(null,
                        message,
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);

            } else {

                int femaleOption = JOptionPane.showConfirmDialog(null,
                        "Are your biological gender is Female?",
                        "Gender",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);

                if (femaleOption == JOptionPane.YES_OPTION) {

                    standardWeight = height_cm - 110;
                    genderPrefix = "Ms.";

                    // แสดงผลลัพธ์ผู้หญิง
                    String message = "Hello, " + genderPrefix + name + "\n"
                            + "If your height is " + String.format("%.1f", height_cm) + " cm.\n"
                            + "Your weight should be " + String.format("%.1f", standardWeight) + " kg.";

                    JOptionPane.showMessageDialog(null,
                            message,
                            "Message",
                            JOptionPane.INFORMATION_MESSAGE);

                } else {

                    JOptionPane.showMessageDialog(null,
                            "You can use BMI to measure your weight and height.",
                            "Message",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null,
                    "Invalid input. Please enter a valid number for height.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }
}
